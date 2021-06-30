package com.nlu.controller;

import com.nlu.model.Bill;
import com.nlu.model.BillDetail;
import com.nlu.model.Product;
import com.nlu.service.BillService;

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
        BillService billService = new BillService();
        List<Bill> bills = billService.getAll();
        System.out.println(bills.size());
        HttpSession session = request.getSession();
        session.setAttribute("listB", bills);


        request.getRequestDispatcher("store/quanlihoadon.jsp").forward(request, response);




    }
}
