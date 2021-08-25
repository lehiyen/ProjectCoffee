package com.nlu.controller;

import com.nlu.model.User;
//import com.nlu.repository.Repository;
import com.nlu.service.UserService;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

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
        User userName = userService.getUserName(username);
        User user = userService.getUser(username,password);
        if (userName == null) {
            request.setAttribute("mess", "Bạn đã nhập sai tên");
            request.getRequestDispatcher("/").forward(request,response);
        }
        if(user == null){
            request.setAttribute("mess1", "Bạn đã nhập sai mật khẩu");
            request.getRequestDispatcher("/").forward(request,response);
        }
        else{
            HttpSession session = request.getSession();
            if (userName.getPhanQuyen().equals("QuanLy")) {
                session.setAttribute("acc",userName);
                response.sendRedirect("/quanli");
            }
            if (userName.getPhanQuyen().equals("Nhanvien")) {
                session.setAttribute("acc",userName);
                response.sendRedirect("/home");
            }

        }

    }


}
