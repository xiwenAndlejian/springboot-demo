package com.otakus.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author gx
 * JDK8以前是通过继承HandlerInterceptorAdapter，
 * 重写其中的方法来实现拦截器的
 * JDK8特性，接口可以声明默认方法(default)以及静态方法
 * 默认方法不需要接口实现类实现，并且接口实现类自动继承
 * 因而 spring 废弃了大部分的抽象类（虽然本例中没有 spring-web-mvc 5.0.4 版本）
 * 所以spring boot相关的文章中的代码都是直接实现原接口
 */
public class DemoInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //在请求到控制层前执行
        System.out.println("控制层处理请求前执行的代码块>>>>>>>");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //在控制层之后执行
        System.out.println("控制层处理请求后执行的代码块>>>>>>>");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //请求发送完成之后执行
        System.out.println("请求完成后执行的代码块>>>>>>>");
    }
}
