package com.nlu.service;

import com.nlu.db.ConnectionPool;
import com.nlu.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.nlu.db.DataSource.*;

import static com.nlu.db.DataSource.getConnection;

public class UserService {
    public User getUser(String username, String password) {
        Connection conn = getConnection();
        String query = "SELECT * FROM user WHERE UserName= ? AND MatKhau=?";
        User user = new User();

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6)
                );
                return user;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = userService.getUser("khanh", "123");
        System.out.println(user.toString());
    }
}
