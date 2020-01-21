package com.boob.sw.model.exp;

import com.boob.sw.model.User;
import lombok.Data;

import java.util.Date;

@Data
public class BlogCommentExp {
    private Long id;
    private Long uId;
    private Long xId;
    private User commentUser;
    private String comment;
    private Integer type;
    private Date gmtCreated;
    private Date gmtModified;

}