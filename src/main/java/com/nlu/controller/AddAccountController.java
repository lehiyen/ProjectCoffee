package com.nlu.controller;

import com.nlu.model.User;
import com.nlu.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/store/signup")
public class AddAccountController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String userID = request.getParameter("userID");
        String username = request.getParameter("username");
        String chucvu = request.getParameter("chucvu");
        String phanquyen = request.getParameter("phanquyen");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        String sdt = request.getParameter("sdt");
        UserService uService = new UserService();
        User user = uService.checkAccountExist(username);
        if (!password.equals(password2)) {
            request.setAttribute("mess", "Mật khẩu nhập lại không đúng");
            request.getRequestDispatcher("/store/signUp.jsp").forward(request,response);
        } else {
            if (user == null) {
//create account
                User u = new User(userID, username, chucvu, phanquyen, password, sdt);
                uService.signup(u);
               response.sendRedirect("/quanli");
            } else {
                request.setAttribute("mes", "user đã tồn tại");
                request.getRequestDispatcher("/store/signUp.jsp").forward(request,response);
            }
        }
    }
}
