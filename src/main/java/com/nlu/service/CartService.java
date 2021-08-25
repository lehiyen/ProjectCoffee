package com.nlu.service;

import com.nlu.db.DataSource;
import com.nlu.model.Cart;
import com.nlu.model.Product;

import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.sql.*;
import java.util.*;

import static com.nlu.db.DataSource.getConnection;
import static com.nlu.db.DataSource.returnConnection;

public class CartService {

    public Product getByID(String id) {
        try {
            Connection conn = getConnection();
            String query = "SELECT * FROM product WHERE IDProduct = ?";
            PreparedStatement s = conn.prepareStatement(query);
            s = conn.prepareStatement(query);
            s.setString(1,id);
            ResultSet rs = s.executeQuery();
            Product pr;
            if(rs.next()) {
                pr = new Product(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6)
                );
                rs.close();
                s.close();
                return pr;
            }
            return null;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }

    }

    public static void main(String[] args) {
        CartService ca = new CartService();
        Product p = ca.getByID("ts789");
        System.out.println(p.toString());
    }

}
