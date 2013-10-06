package com.bla.laa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletWithExceptionInInit extends MyBaseServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        throw new ServletException("Something goes wrong in inti");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

    }
}
