package com.ohgiraffers.section01.filter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/first/filter")
public class FirstFilterTestServlet extends HttpServlet {

    // 필터의 작동 위치는 doGet, doPost가 수행되기 전 실행된다.
    // 필터의 작동위치..

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Servlet 요청의 확인...");

    }
}
