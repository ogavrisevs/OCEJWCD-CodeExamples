package com.bla.laa;

import com.bla.laa.ServletHelper;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class MultipleParams extends HttpServlet {
    private static final Logger logger = Logger.getLogger(MultipleParams.class.getName());

    public MultipleParams() {
        super();
        logger.info("constructor : " + this);
    }

    public void init(ServletConfig config) throws ServletException {
        logger.info("serverlet Example2.init() : " + this);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();

        pw.println("<br> QueryString : " + request.getQueryString());
        pw.println("<br> RemoteUser  : " + request.getRemoteUser());

        new ServletHelper(request, response).printInfo();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        new ServletHelper(request, response).printInfo();
    }
}
