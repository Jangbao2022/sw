package com.boob.sw.interceptor;

import com.boob.sw.enums.UserEnum;
import com.boob.sw.model.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //获取session中的user
        User user = (User) request.getSession().getAttribute("user");
        if (user != null) {
            //获取名为account的cookie
            Cookie[] cookies = request.getCookies();
            for (Cookie cookie : cookies) {
                if ("account".equals(cookie.getName())) {
                    String account = cookie.getValue();
                    if (account.equals(user.getAccount().toString())) {
                        return true;
                    }
                }
            }
        }
        request.setAttribute("errorMessage", UserEnum.USER_ACCOUNT_NOT_LOGIN.getMessage());
        request.getRequestDispatcher("/page/login").forward(request, response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
