package com.gh.web.servlet.controller;

import com.gh.web.servlet.util.R;
import com.gh.web.servlet.util.Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login1")
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        R r = null;

        if("zyw".equals(username) && "123".equals(password)){
            HttpSession session = req.getSession();
            session.setAttribute("username",username);
            //比如，响应用户对象，或者响应 用户名和年龄
            r = R.ok().put("username",username).put("age",22);
        }else{
            r = R.error("用户名或密码错误");
        }
        //响应json数据
        resp.setCharacterEncoding("UTF-8");
        //输出流 和 数据
        Response.toJSON(resp.getOutputStream(), r);
        System.out.println("123中文测试");

    }
}
