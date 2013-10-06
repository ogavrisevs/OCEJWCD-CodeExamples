/*
 * @(#)ServletHelper.java
 *
 * Copyright Swiss Reinsurance Company, Mythenquai 50/60, CH 8022 Zurich. All rights reserved.
 */
package com.bla.laa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.logging.Logger;

public class ServletHelper {
    private static final Logger logger = Logger.getLogger(ServletHelper.class.getName());

    protected static final String HTML_SPACES = "&nbsp;";
    protected static String HTML_SPACES_LINE = "";
    protected static final String HTML_LINE_END = "\n";

    static {
        for (int i = 0; i < 5; i++)
            HTML_SPACES_LINE += HTML_SPACES;
    }

    private HttpServletRequest request;
    private HttpServletResponse response;

    public ServletHelper(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    public void printInfo() throws IOException {
        logger.info("ServletHelper.printInfo");

        PrintWriter pw = response.getWriter();
        pw.append(addHeader().toString());

        pw.println("<br> Method : " + request.getMethod());
        pw.println("<br> RequestURL : " + request.getRequestURL());
        pw.println("<br> QueryString : " + request.getQueryString());
        pw.println("<br> RemoteUser : " + request.getRemoteUser());

        pw.println("<br>");

        Enumeration enumHeader = request.getHeaderNames();
        pw.println("<br> Heders : ");
        while (enumHeader.hasMoreElements()) {
            String head = (String) enumHeader.nextElement();
            pw.println("<br> " + HTML_SPACES_LINE + head + " Val : " + request.getHeader(head));
        }
        pw.println("<br>");

        Enumeration enumParams = request.getParameterNames();
        pw.println("<br> Parameters  : ");
        while (enumParams.hasMoreElements()) {
            Object obj = enumParams.nextElement();
            String[] params = request.getParameterValues((String) obj);
            for (String param : params)
                pw.println("<br>" + HTML_SPACES_LINE + obj + "  :  " + param);
        }
        pw.println("<br>");

        HttpSession hSes = request.getSession();
        pw.println("<br> Session" + hSes);
        pw.println("<br>");

        Enumeration enumAtrib = hSes.getAttributeNames();
        pw.println("<br> AttributeNames : ");
        while (enumAtrib.hasMoreElements()) {
            Object obj = enumAtrib.nextElement();
            Object atriObj = hSes.getAttribute((String) obj);
            pw.println("<br> " + HTML_SPACES_LINE + obj + " : " + atriObj);
        }

        response.setContentType(" text/html");
        pw.append(addFooter().toString());

    }

    private StringBuffer addHeader() {
        StringBuffer sb = new StringBuffer();
        sb.append("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"");
        sb.append("http://www.w3.org/TR/html4/loose.dtd\">");
        sb.append(HTML_LINE_END);
        sb.append("<html>");
        sb.append(HTML_LINE_END);
        sb.append("<head>");
        sb.append(HTML_LINE_END);
        sb.append("<title> Title</title>");
        sb.append(HTML_LINE_END);
        sb.append("</head>");
        sb.append(HTML_LINE_END);
        sb.append("<body>");
        sb.append(HTML_LINE_END);
        return sb;
    }

    private StringBuffer addFooter() {
        StringBuffer sb = new StringBuffer();
        sb.append("</body>");
        sb.append(HTML_LINE_END);
        sb.append("</html>");
        sb.append(HTML_LINE_END);
        return sb;
    }

}
