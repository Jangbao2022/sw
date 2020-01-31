package com.boob.sw.config;

import com.boob.sw.interceptor.LoginInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyWebMvcConfig implements WebMvcConfigurer {


    /**
     * 添加静态资源文件，外部可以直接访问地址
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //需要配置1：----------- 需要告知系统，这是要被当成静态文件的！
        //第一个方法设置访问路径前缀，第二个方法设置资源路径
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }

    /**
     * 配置viewController 页面跳转
     *
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //配置viewController
        registry.addViewController("/main").setViewName("index");
        registry.addViewController("/index").setViewName("index");

        registry.addViewController("/page/register").setViewName("account/register");
        registry.addViewController("/page/forgetPassword").setViewName("account/forgetPassword");

        registry.addViewController("/page/about").setViewName("us/about");
        registry.addViewController("/page/contact").setViewName("us/contact");


    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> excludePaths = new ArrayList<>();
        //首页
        excludePaths.add("/");
        excludePaths.add("/main");
        excludePaths.add("/index");

        //错误页面
        excludePaths.add("/error");

        //登录注册页面
        excludePaths.add("/page/login");
        excludePaths.add("/page/register");
        excludePaths.add("/page/forgetPassword");

        //登录注册操作
        excludePaths.add("/user/login");
        excludePaths.add("/user/logon");
        excludePaths.add("/user/register");
        excludePaths.add("/user/forgetPassword");

        //静态资源
        excludePaths.add("/static/**");
        excludePaths.add("/images/**");
        excludePaths.add("/css/**");
        excludePaths.add("/favicon.ico");
        excludePaths.add("/js/**");
        excludePaths.add("/fonts/**");

//        //配置登录拦截器
//        registry.addInterceptor(new LoginInterceptor())
//                .addPathPatterns("/**")
//                .excludePathPatterns(excludePaths);

    }

}
