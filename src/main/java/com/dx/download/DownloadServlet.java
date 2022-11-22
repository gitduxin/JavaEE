package com.dx.download;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fileName = "/Users/dx/Downloads/img/wallhaven-z8dg9y.png";

        String ContentType = req.getServletContext().getMimeType(fileName);
        String ContentDisposition = "attachment;filenema=1.png";

        resp.setHeader("Content-Type",ContentType);
        resp.setHeader("Content-Disposition",ContentDisposition);

        FileInputStream fis = new FileInputStream(fileName);
        ServletOutputStream out = resp.getOutputStream();
        IOUtils.copy(fis,out);
        fis.close();
    }
}
