package com.dx.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/paramServlet")
public class ParamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration enumeration =  req.getParameterNames();
        while(enumeration.hasMoreElements()){
            String name=(String)enumeration.nextElement();
            String [] value=req.getParameterValues(name);
            System.out.println(name+"="+ Arrays.toString(value));
        }
        System.out.println(Arrays.toString(req.getParameterValues("id")));
        Map<String,String[]> map = req.getParameterMap();
        for(Map.Entry<String, String[]> entrySet : map.entrySet()){
            System.out.println(entrySet.getKey()+"-----"+ Arrays.toString(entrySet.getValue()));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
