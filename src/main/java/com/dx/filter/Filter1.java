package com.dx.filter;

import javax.servlet.*;
import java.io.IOException;

public class Filter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println(filterConfig.getFilterName());
//        System.out.println(filterConfig.getInitParameter("p1"));
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("拦截........");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
