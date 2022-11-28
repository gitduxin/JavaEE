package com.dx.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

@WebServlet(name = "HeaderServlet", value = "/headerServlet")
public class HeaderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration enumeration = request.getHeaderNames();
        while ((enumeration.hasMoreElements())){
            String name=(String)enumeration.nextElement();
            String value = request.getHeader(name);
            System.out.println(name+"="+ value);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
