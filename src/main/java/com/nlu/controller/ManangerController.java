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

@WebServlet(urlPatterns = "/quanli")
public class ManangerController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        UserService us = new UserService();
        List<User> u = us.findAll();
        HttpSession session2 = request.getSession();
        session2.setAttribute("listU", u);
        request.getRequestDispatcher("store/quanlihoadon.jsp").forward(request, response);
    }
}
