package com.nlu.config;

import java.sql.*;

public class DBConfiguration {
//    public static final String DB_USERNAME = "root";
//    public static final String DB_PASSWORD = "";
//    public static final String DB_URL = "jdbc:mysql://localhost/test?useUnicode=true;characterEncoding=UTF-8";
    public static final String DB_USERNAME = "\n" +
        "pysmfvitgfjzta";
    public static final String DB_PASSWORD = "b71212c85bd82923d8c29063251480136bd882bf7649857fdf7106053c11c48d";
    public static final String DB_URL = "jdbc:mysql://\n" +
            "ec2-54-83-82-187.compute-1.amazonaws.com/\n" +
            "ddhtm2oksk3e0b?useUnicode=true;characterEncoding=UTF-8";
    public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final int DB_MAX_CONNECTION = 100;

}