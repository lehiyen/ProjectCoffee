package com.nlu.controller;

import com.nlu.model.User;
import com.nlu.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("")
public class LoginController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserService userService = new UserService();
        User user = userService.getUser(username, password);
        if (user == null) {
            request.setAttribute("err", "User name hoặc mật khẩu sai");
        }
        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("auth", user);
            if (user.getRole().equals("QuanLy")) {
                request.getRequestDispatcher("/admin-page/quanlihoadon.jsp").forward(request, response);
            }
            if (user.getRole().equals("Nhanvien")) {
                response.sendRedirect("/store");
            }
        }

    }
}
