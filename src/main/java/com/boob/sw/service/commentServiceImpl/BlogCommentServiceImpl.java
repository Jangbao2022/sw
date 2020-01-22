package com.boob.sw.service.commentServiceImpl;

import com.boob.sw.enums.CommentTypeEnum;
import com.boob.sw.mapper.BlogCommentMapper;
import com.boob.sw.mapper.BlogMapper;
import com.boob.sw.model.Blog;
import com.boob.sw.model.BlogComment;
import com.boob.sw.model.User;
import com.boob.sw.service.BlogCommentServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.Oneway;
import java.util.Date;

@Service
public class BlogCommentServiceImpl implements BlogCommentServiceDao {

    @Autowired
    private BlogCommentMapper blogCommentMapper;

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public boolean checkComment(BlogComment blogComment, User user) {
        boolean flag = user.getId().equals(blogComment.getuId());
        if (flag) {
            if (CommentTypeEnum.COMMENT_MAJOR.getType().equals(blogComment.getType())) {
                //检验一级评论
                return checkOneLevelComment(blogComment);
            } else if (CommentTypeEnum.COMMENT_COMMENT.getType().equals(blogComment.getType())) {
                //检验二级评论
                return checkTwoLevelComment(blogComment);
            }
        }
        return false;
    }

    @Override
    public boolean checkOneLevelComment(BlogComment blogComment) {
        Blog blog = blogMapper.selectByPrimaryKey(blogComment.getxId());
        return blog != null;
    }

    @Override
    public boolean checkTwoLevelComment(BlogComment blogComment) {
        BlogComment blogCommentFather = blogCommentMapper.selectByPrimaryKey(blogComment.getxId());
        return blogCommentFather != null;
    }

    @Override
    public boolean uploadComment(BlogComment blogComment) {
        //把commentUser 和其他一些属性封装起来
        blogComment.setGmtCreated(new Date());
        blogComment.setGmtModified(blogComment.getGmtCreated());

        if (CommentTypeEnum.COMMENT_MAJOR.getType().equals(blogComment.getType())) {
            //一级评论上传
            return uploadOneLevelComment(blogComment);
        } else if (CommentTypeEnum.COMMENT_COMMENT.getType().equals(blogComment.getType())) {
            //二级评论上传
            return uploadTwoLevelComment(blogComment);
        }
        //上传失败
        return false;
    }


    @Override
    public boolean uploadOneLevelComment(BlogComment blogComment) {
        //一级评论要做的事

        int insert = blogCommentMapper.insert(blogComment);
        return insert == 1;
    }

    @Override
    public boolean uploadTwoLevelComment(BlogComment blogComment) {
        //二级评论要做的事

        int insert = blogCommentMapper.insert(blogComment);
        return insert == 1;
    }
}