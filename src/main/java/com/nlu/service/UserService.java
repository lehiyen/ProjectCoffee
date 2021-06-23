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

    public static void main(String[] args) {
        UserService userService = new UserService();
        User u = new User("789", "khanh2", "NhanVien", "QuanLy", "789", "7894561237");
        userService.signup(u);
        User user = userService.getUser("khanh2", "789");
        System.out.println(user.toString());


    }
}
