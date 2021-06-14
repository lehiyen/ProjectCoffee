package com.nlu.config;

import java.sql.*;

public class DBConfiguration {
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";
    public static final String DB_URL = "jdbc:mysql://localhost/coffee?useUnicode=true;characterEncoding=UTF-8";
    public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final int DB_MAX_CONNECTION = 10;

}