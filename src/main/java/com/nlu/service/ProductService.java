package com.nlu.service;

import com.nlu.model.Product;
import com.nlu.repository.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.nlu.db.DataSource.getConnection;
import static com.nlu.db.DataSource.returnConnection;

public class ProductService  implements Repository<Product>{

    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM product";
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                Product product = new Product(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5));
                list.add(product);
            }
            returnConnection(connection);
            return list;
        } catch (SQLException e) {
            System.out.println(e);
            return list;
        }

    }

    @Override
    public List<Product> findByName(String name) throws SQLException {
        return null;
    }

    public static void main(String[] args) {
        ProductService pr =new ProductService();
        List<Product> lists  = pr.findAll();
        for (Product o : lists){
            System.out.println(o);

        }
    }

}