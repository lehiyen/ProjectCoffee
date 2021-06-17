package com.nlu.controller;

import com.nlu.model.Product;
import com.nlu.service.ProductService;
import com.nlu.service.SearchService;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
@WebServlet(urlPatterns = "/home")
public class StoreController extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductService productService = new ProductService();
        SearchService search = new SearchService();
        response.setContentType("text/html;charset=UTF-8");
        List<Product> products = productService.findAll();
        HttpSession session = request.getSession();
        session.setAttribute("listP", products);
        request.getRequestDispatcher("store/storePage.jsp").forward(request, response);
    }
}
