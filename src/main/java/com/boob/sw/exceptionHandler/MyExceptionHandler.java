package com.boob.sw.exceptionHandler;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(Exception.class) // 所有的异常都是Exception子类
    public ModelAndView exceptionHandler(HttpServletRequest request, Exception e) {
        // 出现异常之后会跳转到此方法

        //客户端异常
        ModelAndView mav = new ModelAndView("error/4xx"); // 设置跳转路径

        mav.addObject("exception", e); // 将异常对象传递过去
        mav.addObject("url", request.getRequestURL()); // 获得请求的路径
        return mav;
    }
}
