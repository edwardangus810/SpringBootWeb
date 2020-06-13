package com.example.springbootweb.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 整合Servlet方式二
 * 适合少数量的Servlet整合
 */
public class SecondServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("进入Second Servlet");
        System.out.println("Second Servlet......");
        System.out.println("离开Second Servlet");
    }
}
