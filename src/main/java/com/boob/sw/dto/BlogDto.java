package com.boob.sw.dto;

import com.boob.sw.model.Blog;
import com.boob.sw.model.User;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 封装页面类
 * blog
 */
@Data
@Component
public class BlogDto implements PageDto {

    //博客
    private Blog blog;
    //作者
    private User author;

}
