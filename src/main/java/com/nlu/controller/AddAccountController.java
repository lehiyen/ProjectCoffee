package com.nlu.controller;

import com.nlu.model.User;
import com.nlu.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/signUp")
public class AddAccountController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String userID = request.getParameter("userID");
        String username = request.getParameter("userName");
        String chucvu = request.getParameter("chucVu");
        String phanquyen = request.getParameter("phanQuyen");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        String sdt = request.getParameter("sdt");
        String ql = "QuanLy";
        String nv = "Nhanvien";
        UserService uService = new UserService();


        if (uService.checkAccountExist(username)) {
            request.setAttribute("mes", " tên đã đã tồn tại");
            request.getRequestDispatcher("/store/signUp.jsp").forward(request, response);
            return;
        } else if (!password.equals(password2)) {
            request.setAttribute("mess", "Mật khẩu nhập lại không đúng");
            request.getRequestDispatcher("/store/signUp.jsp").forward(request, response);
            return;
        } else {


            User u = new User();
            u.setUserid(userID);
            u.setUserName(username);
            u.setChucVu(chucvu);
            u.setPhanQuyen(phanquyen);
            u.setPassword(password);
            u.setPhone(sdt);
            uService.signup(u);
            response.sendRedirect("/quanli");
        }
    }
}
