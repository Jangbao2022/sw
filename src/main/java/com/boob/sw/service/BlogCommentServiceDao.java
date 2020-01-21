package com.boob.sw.service;

import com.boob.sw.model.BlogComment;
import com.boob.sw.model.User;

//上传blog评论
public interface BlogCommentServiceDao {

    /**
     * 根据blogComment和commentUser实现封装blogComment
     *
     * @param blogComment
     * @param commentUser
     * @return
     */
    boolean uploadComment(BlogComment blogComment, User commentUser);

    /**
     * 上传一级评论
     *
     * @param blogComment
     * @return
     */
    boolean uploadOneLevelComment(BlogComment blogComment);

    /**
     * 上传二级评论
     *
     * @param blogComment
     * @return
     */
    boolean uploadTwoLevelComment(BlogComment blogComment);
}
