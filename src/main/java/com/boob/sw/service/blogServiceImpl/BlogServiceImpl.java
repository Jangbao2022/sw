package com.boob.sw.service.blogServiceImpl;

import com.boob.sw.dto.BlogDto;
import com.boob.sw.dto.PagesDto;
import com.boob.sw.enums.PageUrlEnum;
import com.boob.sw.mapper.BlogMapper;
import com.boob.sw.mapper.UserMapper;
import com.boob.sw.model.Blog;
import com.boob.sw.model.BlogExample;
import com.boob.sw.model.User;
import com.boob.sw.service.BlogServiceDao;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogServiceDao {

    @Autowired
    private BlogMapper blogMapper;

    @Autowired
    private UserMapper userMapper;

    /**
     * 获取页面Dto
     *
     * @param page
     * @return
     */
    @Override
    public PagesDto getPages(String page) {

        //创建pagesDto并注入url
        PagesDto<Blog> pagesDto = new PagesDto<>(PageUrlEnum.ARTICLE_PAGE.getUrl());
        //转换成合法页码
        Integer checkedPage = checkPage(page);

        //查询总blog数
        BlogExample example = new BlogExample();
        Integer totalBlog = (int) blogMapper.countByExample(example);

        //计算总页面 计算前后页 当前页
        pagesDto.countTotalPage(totalBlog);
        pagesDto.countPreAndAfter(checkedPage);

        //查询出所有blog 进行封装
        List<Blog> blogs = blogMapper.selectByExampleWithRowbounds(example, new RowBounds(checkedPage - 1, 4));
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
            Blog blog = blogMapper.selectByPrimaryKey(checkedId);
            User author = userMapper.selectByPrimaryKey(blog.getuId());
            blogDto.setBlog(blog);
            blogDto.setAuthor(author);
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
