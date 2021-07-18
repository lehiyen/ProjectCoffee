package com.nlu.controller;

import com.nlu.model.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.Phaser;

@WebServlet(urlPatterns = "/addProduct")
public class AddProductIntoCart extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,     IOException {
        String id = request.getParameter("id");
        Cart cart = Cart.getCart(request.getSession());

        cart.addQuantity(id, 1);
        cart.commit(request.getSession());
        request.getRequestDispatcher("store/storePage.jsp").forward(request, response);
    }
}
