package com.dx.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("servlet3.....");
        resp.setHeader("bbb","BBB");

        //resp.setHeader("Content-Type","text/html;charset=UTF-8");
        resp.getWriter().println("哈哈哈......");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {

    }
}
