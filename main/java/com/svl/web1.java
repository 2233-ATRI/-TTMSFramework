package com.svl;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/doem2")
public class web1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String method=req.getMethod();
        System.out.println(method);

        String contextPath=req.getContextPath();
        System.out.println(contextPath);

        StringBuffer url=req.getRequestURL();
        System.out.println(url);

        String uri=req.getRequestURI();
        System.out.println(uri);


        //GET获取请求信息
        String queryString=req.getQueryString();
        System.out.println(queryString);

        //--------------------------------

        String header=req.getHeader("user-agent");
        System.out.println(header);




        System.out.println("hai");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //POST获取请求数据-htt.html
        BufferedReader br=req.getReader();
        String line= br.readLine();
        System.out.println(line);
    }
}
