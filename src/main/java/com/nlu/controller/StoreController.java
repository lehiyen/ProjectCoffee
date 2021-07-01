package com.nlu.controller;

import com.nlu.model.Cart;
import com.nlu.model.Product;
import com.nlu.model.User;
import com.nlu.service.CartService;
import com.nlu.service.ProductService;
import com.nlu.service.SearchService;
import com.nlu.service.UserService;
import lombok.SneakyThrows;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = "/home")
public class StoreController extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ProductService productService = new ProductService();
        List<Product> products = productService.findAll();
        HttpSession session = request.getSession();
        session.setAttribute("data", products);

        request.getRequestDispatcher("store/storePage.jsp").forward(request, response);
    }
}
