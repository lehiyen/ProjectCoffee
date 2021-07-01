package com.nlu.controller;

import com.nlu.model.Product;
import com.nlu.model.User;
import com.nlu.repository.Repository;
import com.nlu.service.ProductService;
import com.nlu.service.UserService;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @SneakyThrows
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserService userService = new UserService();
        User user = userService.getUser(username, password);
        if (user == null) {
            request.setAttribute("mess", "Bạn đã nhập sai tên hoặc mật khẩu");
            request.getRequestDispatcher("/").forward(request,response);
        }
        else{
            HttpSession session = request.getSession();
            if (user.getPhanQuyen().equals("QuanLy")) {
                session.setAttribute("acc",user);
                response.sendRedirect("/quanli");
            }
            if (user.getPhanQuyen().equals("Nhanvien")) {
                session.setAttribute("acc",user);
                response.sendRedirect("/home");
            }

        }

    }


}
