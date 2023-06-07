package com.svl;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyHttpServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        String method=request.getMethod();

        if ("GET".equals(method)){
            doGet(servletRequest,servletResponse);
        }
        else  if ("POST".equals(method)){
            doPOST(servletRequest,servletResponse);
        }
    }




    protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
    }
    protected void doPOST(ServletRequest servletRequest, ServletResponse servletResponse) {
    }







    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
