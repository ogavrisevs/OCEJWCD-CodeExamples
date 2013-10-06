package com.bla.laa;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyBaseServlet extends HttpServlet {


    public MyBaseServlet() {
        System.out.println("This is SimpleServlet() empty Constructor");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("This is Override init () Constructor");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("This is Override init (ServletConfig) Constructor");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("This is destroy()");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("This is javax.servlet.http.service(HttpServletRequest, HttpServletResponse )");
        super.service(req, resp);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("This is javax.servlet.http.service(ServletRequest, ServletResponse )");
        super.service(req, res);
    }

}
