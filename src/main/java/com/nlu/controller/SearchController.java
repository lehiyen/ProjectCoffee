package com.nlu.controller;

import com.nlu.model.Product;
import com.nlu.service.SearchService;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = "/search")
public class SearchController extends HttpServlet {
    @SneakyThrows
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String txtSearch = request.getParameter("txt");
        SearchService search = new SearchService();
        List<Product> list = null;
        try {
            list = search.findByName(txtSearch);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        request.setAttribute("data", list);
        request.getRequestDispatcher("store/storePage.jsp").forward(request, response);

    }
}
