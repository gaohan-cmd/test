package com.gh.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/login")
public class MyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname=req.getParameter("uname");
        String pwd=req.getParameter("pwd");
        resp.setContentType("text/html;charset=utf-8");
        if("zhangsan".equals(uname) && "123".equals(pwd)){
            req.setAttribute("username",uname);
            req.getRequestDispatcher("show.jsp").forward(req,resp);
            return;
        }else{
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }
    }
}
