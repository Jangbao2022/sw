package com.boob.sw.service.commentServiceImpl;

import com.boob.sw.enums.CommentTypeEnum;
import com.boob.sw.mapper.BlogCommentMapper;
import com.boob.sw.model.BlogComment;
import com.boob.sw.model.User;
import com.boob.sw.service.BlogCommentServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BlogCommentServiceImpl implements BlogCommentServiceDao {

    @Autowired
    private BlogCommentMapper blogCommentMapper;

    @Override
    public boolean uploadComment(BlogComment blogComment, User commentUser) {
        //把commentUser 和其他一些属性封装起来
        blogComment.setGmtCreated(new Date());
        blogComment.setGmtModified(blogComment.getGmtCreated());
        blogComment.setuId(commentUser.getId());


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