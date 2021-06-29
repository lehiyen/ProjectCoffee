package com.nlu.controller;

import com.nlu.model.Cart;
import com.nlu.model.Product;
import com.nlu.service.CartService;
import com.sun.org.apache.xerces.internal.impl.io.UCSReader;

import javax.print.DocFlavor;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "addCart", urlPatterns = "/addcart")
public class CartController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("id");
        if (id == null) {
            response.sendRedirect("/home");
            return;
        }
        CartService pe = new CartService();
        Product p = pe.getByID(id);
        if (p == null) {
            response.sendRedirect("/home");
            return;
        }
        HttpSession session = request.getSession();
        Cart c = Cart.getCart(session);
        c.put(p);
        c.commit(session);
        request.getRequestDispatcher("/home").forward(request, response);
    }
}
