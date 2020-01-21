package com.boob.sw.service;

import com.boob.sw.model.BlogComment;
import com.boob.sw.model.User;

//上传blog评论
public interface BlogCommentServiceDao {

    /**
     * 检验提交的评论
     *
     * @param blogComment
     * @param user
     * @return
     */
    boolean checkComment(BlogComment blogComment, User user);

    /**
     * 检验一级评论
     *
     * @param blogComment
     * @return
     */
    boolean checkOneLevelComment(BlogComment blogComment);


    /**
     * 检验二级评论
     *
     * @param blogComment
     * @return
     */
    boolean checkTwoLevelComment(BlogComment blogComment);


    /**
     * 根据blogComment和commentUser实现封装blogComment
     *
     * @param blogComment
     * @return
     */
    boolean uploadComment(BlogComment blogComment);

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
