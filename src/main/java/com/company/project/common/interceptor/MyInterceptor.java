package com.company.project.common.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author HuangShiXing
 * @Description [自定义拦截器]
 * @Date  16:05 2020/12/9
 */
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle (HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println ("自定义拦截器{preHandle}测试");
        return true;
    }

    @Override
    public void postHandle (HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println ("自定义拦截器{postHandle}测试");
    }

    @Override
    public void afterCompletion (HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println ("自定义拦截器{afterCompletion}测试");
    }
}
