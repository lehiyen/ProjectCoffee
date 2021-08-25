package com.nlu.config;

import java.sql.*;

public class DBConfiguration {
//    public static final String DB_USERNAME = "root";
//    public static final String DB_PASSWORD = "";
//    public static final String DB_URL = "jdbc:mysql://localhost/test?useUnicode=true;characterEncoding=UTF-8";
//    public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
//    public static final int DB_MAX_CONNECTION = 100;
public static final String HOST_NAME = "remotemysql.com";
    public static final String DB_NAME = "iRhuKBkTcg";
    public static final String DB_PORT = "3306";
    public static final String USER_NAME = "iRhuKBkTcg";
    public static final String PASSWORD = "HcfcUZ7K9P";
    public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String CONNECTION_URL = "jdbc:mysql://" + HOST_NAME + ":" + DB_PORT + "/" + DB_NAME;
    public static final int DB_MAX_CONNECTION = 30;

}