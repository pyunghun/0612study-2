package com.ohgiraffers.section01.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/first/*")
public class FisrtFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("init 호출됨...");

    }

    @Override
    public void destroy() {
        System.out.println("destory 호출됨...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("Filter doFilter 호출됨...");


        // 다음 필터를 호출하는 역할을 한다. 다음 필터가 없으면 servlet을 호출한다.
        chain.doFilter(request, response);

        System.out.println("Servlet 요청 수행 완료...");
    }
}
