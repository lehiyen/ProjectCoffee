package com.nlu.service;

import com.nlu.model.Bill;
import com.nlu.model.BillDetail;
import com.nlu.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.nlu.db.DataSource.getConnection;
import static com.nlu.db.DataSource.returnConnection;

public class BillService {
    public static List<Bill> getAll(){
        List<Bill> list = new ArrayList<>();
        String query = "SELECT * FROM bill;";
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Bill bill = new Bill(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getDate(3));
                list.add(bill);
            }
            returnConnection(connection);
            return list;
        } catch (SQLException e) {
            System.out.println(e);
            return list;
        }
    }
    public List<BillDetail> getAllDetail(String id){
        List<BillDetail> list = new ArrayList<>();
        String query = "SELECT * FROM billdetail WHERE id =?;";
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BillDetail billDetail = new BillDetail(
                        rs.getString(1),
                        rs.getInt(2),
                        rs.getInt(3));
                list.add(billDetail);
            }
            returnConnection(connection);
            return list;
        } catch (SQLException e) {
            System.out.println(e);
            return list;
        }
    }
    public static Bill getBill(String id){
       Bill result = null;
        String query = "SELECT * FROM bill WHERE id = ?;";
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                result = new Bill(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getDate(3));
            }
            returnConnection(connection);
            return result;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
    public static List<Product> getProductByBill(String id){
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM billdetail b JOIN product p ON b.idPro = p.IDProduct WHERE b.idPro= ? ";
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,id);
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
//                Product product = new Product(
//                        rs.getString(4),
//                        rs.getString(5),
//                        rs.getString(6),
//                        rs.getString(7),
//                        rs.getInt(8));
                Product product = new Product(rs.getString("IDProduct"),
                        rs.getString("NameProduct"),
                        rs.getString("IDItem"),
                        rs.getString("image"),
                        rs.getInt("Price"));
                list.add(product);
            }
            returnConnection(connection);
            return list;
        } catch (SQLException e) {
            System.out.println(e);
            return list;
        }
    }


    public static void main(String[] args) {
        List<Bill> bills = new ArrayList<>();
        bills = getAll();
        System.out.println(bills.toString());
        String id = "123";
//        Bill bill = getBill(id);
//        System.out.println(bill.toStrig());
        BillService bi = new BillService();
        List<Product> pro = bi.getProductByBill(id);
        System.out.println(pro.toString());
    }
}
