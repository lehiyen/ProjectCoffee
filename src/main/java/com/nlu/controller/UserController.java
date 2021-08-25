//package com.nlu.controller;
//
//import com.nlu.model.User;
//import com.nlu.service.UserService;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//import java.util.List;
//@WebServlet(urlPatterns = "/quanli/user")
//public class UserController extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//doGet(request,response);
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        UserService us = new UserService();
//        List<User> u =  us.findAll();
//        HttpSession session = request.getSession();
//        session.setAttribute("listU", u);
//        request.getRequestDispatcher("/quanli/user").forward(request, response);
//
//    }
//}
