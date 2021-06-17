package com.nlu.service;

import com.nlu.model.Product;
import com.nlu.repository.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.nlu.db.DataSource.getConnection;
import static com.nlu.db.DataSource.returnConnection;

public class SearchService implements Repository<Product> {
    @Override
    public Collection<Product> findAll() throws SQLException {
        return null;
    }

    @Override
    public List<Product> findByName(String name) throws SQLException {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM product WHERE NameProduct LIKE ?";
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();
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

    public static void main(String[] args) throws SQLException {

        SearchService se = new SearchService();
        List<Product> list = se.findByName("M");
        for (Product o : list) {
            System.out.println(o);
        }
    }
}
