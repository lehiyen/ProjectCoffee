package com.nlu.service;

import com.nlu.db.ConnectionPool;
import com.nlu.model.Product;
import com.nlu.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.nlu.db.DataSource.*;

import static com.nlu.db.DataSource.getConnection;
import static com.nlu.db.DataSource.returnConnection;

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
                user = new User(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
                return user;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public User checkAccountExist(String username) {
        Connection conn = getConnection();
        String query = "SELECT * FROM user WHERE UserName= ?";
        User user = new User();

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                user = new User(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
                return user;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public String signup(User user) {
        Connection conn = getConnection();
        String result = "data ok";
        String query = "INSERT INTO user VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user.getUserid());
            ps.setString(2, user.getUserName());
            ps.setString(3, user.getChucVu());
            ps.setString(4, user.getPhanQuyen());
            ps.setString(5, user.getPassword());
            ps.setString(6, user.getPhone());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            result = "data not ok";

        }
        return result;
    }
    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        String query = "SELECT * FROM user";
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                User u = new User(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
                list.add(u);
            }
            returnConnection(connection);
            return list;
        } catch (SQLException e) {
            System.out.println(e);
            return list;
        }

    }
    public static void main(String[] args) {
        UserService userService = new UserService();
       List<User> u = userService.findAll();
       for (User us : u){
           System.out.println(us);
       }


    }
}
