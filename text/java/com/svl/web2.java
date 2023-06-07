package com.svl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

//@WebServlet("/doem4")
public class web2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("GET...");

        Map<String,String[]> map=req.getParameterMap();
        for(String key : map.keySet()) {
            System.out.print(key + ":");
            String[] values = map.get(key);
            for (String value : values) {
                System.out.print(value + "");
            }
            System.out.println();
            System.out.println("---------------------------");
        }
        //根据key获取参数值，数组
        String[] hobbies=req.getParameterValues("hobby");
        for(String hobby:hobbies){
            System.out.print(hobby);
        }

        //根据key获取单个参数值
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        System.out.println(username);
        System.out.println(password);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("POSt...");

        this.doGet(req,resp);
//        Map<String,String[]> map=req.getParameterMap();
//        for(String key : map.keySet()) {
//            System.out.print(key + ":");
//            String[] values = map.get(key);
//            for (String value : values) {
//                System.out.print(value + "");
//            }
//            System.out.println();
//            System.out.println("---------------------------");
//            }
//        //根据key获取参数值，数组
//            String[] hobbies=req.getParameterValues("hobby");
//            for(String hobby:hobbies){
//                System.out.print(hobby);
//            }
//
//        //根据key获取单个参数值
//             String username=req.getParameter("username");
//             String password=req.getParameter("password");
//             System.out.println(username);
//             System.out.println(password);
    }

}
