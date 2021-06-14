package com.nlu.service;

import com.nlu.db.ConnectionPool;
import com.nlu.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.nlu.db.DataSource.*;

import static com.nlu.db.DataSource.getConnection;

public class UserService {
    public User getUser(String username, String password) {
        Connection conn = getConnection();
        String query = "SELECT * FROM USER WHERE username= ? AND password=?";
        User user = new User();
        String result = user.toMd5(password);

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, result);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6)
                );
            }
            return user;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }



//    public void save(User user, String role) {
//        Connection conn = getConnection();
//        String query = "INSERT INTO `user`( `user_key`, `username`, `password`, `email`, `phone`, `city`, `district`, `address_details`, `role`) VALUES (?,?,?,?,?,?,?,?,?)";
//        try {
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1, user.getKey());
//            ps.setString(2, user.getUsername());
//            ps.setString(3, user.getPassword());
//            ps.setString(4, user.getEmail());
//            ps.setString(5, user.getPhone());
//            ps.setString(6, user.getCity());
//            ps.setString(7, user.getDistric());
//            ps.setString(8, user.getAdddressDetails());
//            ps.setString(9, role);
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }

//    public boolean exitsUsername(String userName) {
//        Connection conn = getConnection();
//        String query = "SELECT username from user WHERE username=?";
//
//        try {
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1, userName);
//            ResultSet rs = ps.executeQuery();
//            String username = "";
//            while (rs.next()) {
//                username = rs.getString(1);
//            }
//            if (username.equals(userName)) {
//                return true;
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return false;
//    }

//    public boolean exitsEmail(String email) {
//        Connection conn = getConnection();
//        String query = "SELECT email from user WHERE email=?";
//        String result = "";
//        try {
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1, email);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                result = rs.getString(1);
//            }
//            if (email.equals(result)) {
//                return true;
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return false;
//    }

//    public static void main(String[] args) {
//        UserService userService = new UserService();
//        User user = userService.getUser("khanhduy", "pass");
//        System.out.println(user.toString());
////        userService.save(new User(3,"key","khanhduy","password","18130060@gmail.com","0869104353","Ben Tre","Ben Tre","addresss",""),"customer");
//    }
}
