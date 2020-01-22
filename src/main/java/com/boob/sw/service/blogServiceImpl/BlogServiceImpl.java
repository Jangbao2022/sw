package com.boob.sw.service.blogServiceImpl;

import com.boob.sw.dto.BlogDto;
import com.boob.sw.dto.PagesDto;
import com.boob.sw.enums.CommentTypeEnum;
import com.boob.sw.enums.EveryPageElementCount;
import com.boob.sw.enums.PageUrlEnum;
import com.boob.sw.mapper.BlogCommentMapper;
import com.boob.sw.mapper.BlogMapper;
import com.boob.sw.mapper.UserMapper;
import com.boob.sw.model.*;
import com.boob.sw.model.exp.BlogCommentExp;
import com.boob.sw.service.BlogServiceDao;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogServiceDao {

    @Autowired
    private BlogMapper blogMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BlogCommentMapper blogCommentMapper;

    /**
     * 获取页面Dto
     *
     * @param page
     * @return
     */
    @Override
    public PagesDto getPages(String page) {

        //创建pagesDto并注入url
        PagesDto<Blog> pagesDto = new PagesDto<>(PageUrlEnum.ARTICLE_BLOGS_PAGE.getUrl());

        //设置blogs页面包含数
        pagesDto.setCONTAINS(EveryPageElementCount.BLOGS.getCount());
        //转换成合法页码
        Integer checkedPage = checkPage(page);

        //查询总blog数
        BlogExample example = new BlogExample();
        Integer totalBlog = (int) blogMapper.countByExample(example);

        //计算总页面 计算前后页 当前页
        pagesDto.countTotalPage(totalBlog);
        pagesDto.countPreAndAfter(checkedPage);

        //查询出所有blog 进行封装
        List<Blog> blogs = blogMapper.selectByExampleWithRowbounds(example, new RowBounds(checkedPage - 1, EveryPageElementCount.BLOGS.getCount()));
        pagesDto.setElements(blogs);

        return pagesDto;
    }

    /**
     * 检查page合法性
     *
     * @param page
     * @return
     */
    @Override
    public Integer checkPage(String page) {
        Integer checkedPage;
        try {
            //如果解析失败
            checkedPage = Integer.parseInt(page);
        } catch (NumberFormatException e) {
            //返回第一页
            return 1;
        }
        //返回正常页
        return checkedPage;
    }


    /**
     * 获取单篇博客页面
     *
     * @param id
     * @return
     */
    @Override
    public BlogDto getPage(String id) {

        //封装blog页面
        BlogDto blogDto = new BlogDto();
        Long checkedId = checkId(id);
        if (checkedId != null) {
            //获取blog
            Blog blog = blogMapper.selectByPrimaryKey(checkedId);
            //获取作者
            User author = userMapper.selectByPrimaryKey(blog.getuId());
            //获取评论
            BlogCommentExample example = new BlogCommentExample();
            example.createCriteria()
                    .andTypeEqualTo(CommentTypeEnum.COMMENT_MAJOR.getType())
                    .andXIdEqualTo(blog.getId());
            List<BlogComment> blogComments = blogCommentMapper.selectByExample(example);

            //扩展将评论人加入
            List<BlogCommentExp> blogCommentExps = new ArrayList<>();
            for (BlogComment blogComment : blogComments) {
                BlogCommentExp blogCommentExp = new BlogCommentExp();
                BeanUtils.copyProperties(blogComment, blogCommentExp);
                User commentUser = userMapper.selectByPrimaryKey(blogComment.getuId());
                blogCommentExp.setCommentUser(commentUser);

                blogCommentExps.add(blogCommentExp);
            }

            blogDto.setBlog(blog);
            blogDto.setAuthor(author);
            blogDto.setComments(blogCommentExps);
        }
        return blogDto;
    }

    /**
     * 检查id属性
     *
     * @param id
     * @return
     */
    @Override
    public Long checkId(String id) {
        Long checkedId;
        try {
            checkedId = Long.parseLong(id);
        } catch (NumberFormatException e) {
            return null;
        }
        return checkedId;
    }
}
