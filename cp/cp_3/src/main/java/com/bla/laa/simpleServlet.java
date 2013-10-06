package com.bla.laa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServlet extends MyBaseServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("SimpleServlet.doGet(HttpServletRequest, HttpServletResponse)");

		PrintWriter pw = response.getWriter();
		pw.println(" doGet Call ");

        ServletConfig servletConfig = this.getServletConfig();
        Enumeration<String> e = servletConfig.getInitParameterNames();
        while(e.hasMoreElements()){
            pw.println(" Param found "+ e.nextElement());
        }

    }

}
