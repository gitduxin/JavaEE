package com.dx.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.xml.transform.Source;
import java.io.IOException;

@WebServlet(name = "UrlServlet", value = "/UrlServlet")
public class UrlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        //http://localhost:8080/JavaEE/UrlServlet
        System.out.println(req.getRequestURL());

        //JavaEE/UrlServlet
        System.out.println(req.getRequestURI());

        ///UrlServlet
        System.out.println(req.getServletPath());

        //JavaEE
        System.out.println(req.getContextPath());

        //null
        System.out.println(req.getPathInfo());

        System.out.println(req.getScheme()+"://"+req.getRemoteHost()+":"+req.getServerPort());

        System.out.println(req.getRemoteAddr()+"------"+req.getRemoteHost());

        String path = req.getContextPath();
        String basePath = req.getScheme() + "://" + req.getServerName() + path + "/";
        System.out.println(basePath);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
