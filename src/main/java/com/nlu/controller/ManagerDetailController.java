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

@WebServlet(name = "/detailBill", urlPatterns = "/detailBill")
public class ManagerDetailController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BillService billService = new BillService();

        HttpSession session = request.getSession();
        String id = request.getParameter("id");
        System.out.println(id);

        List<BillDetail> billdetails = billService.getAllDetail(id);
        session.setAttribute("listD", billdetails);
        Bill bill = billService.getBill(id);
        session.setAttribute("bill", bill);
        List<Product> listPro = billService.getProductByBill(id);
        session.setAttribute("listPro", listPro);
        request.getRequestDispatcher("store/chitiethoadon.jsp").forward(request, response);
    }
}
