package com.dx.listener;

import com.dx.filter.Filter1;
import com.dx.servlet.Servlet1;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class Listener1 implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletRegistration.Dynamic servlet1 = sce.getServletContext().addServlet("Servlet1", Servlet1.class);
        servlet1.addMapping("/Servlet1");

        FilterRegistration.Dynamic filter1 = sce.getServletContext().addFilter("filter1", Filter1.class);
        filter1.setInitParameter("ppp","www");
        filter1.addMappingForUrlPatterns(null,true,"/*");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext Destroy.......");
    }
}
