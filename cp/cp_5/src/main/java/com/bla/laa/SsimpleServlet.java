package com.bla.laa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SsimpleServlet extends HttpServlet {

    private final String pageBeginig = "<!DOCTYPE html><html><head><title>title</title></head><body>";
    private final String pageEnd = "</body></html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.println(pageBeginig);
        pw.println("<a href='"+ req.getContextPath()  +"/PageInWebAppRoot.html'>PageInWebAppRoot</a>");
        pw.println(pageEnd);
    }
}