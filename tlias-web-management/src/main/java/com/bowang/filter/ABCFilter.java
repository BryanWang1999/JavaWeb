package com.bowang.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(urlPatterns = "/*")
public class ABCFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("ABC 拦截到了请求 放行前逻辑");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("ABC 拦截到了请求 放行后逻辑");
    }
}
