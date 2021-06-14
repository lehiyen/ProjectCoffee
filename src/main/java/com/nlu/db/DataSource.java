package com.nlu.db;

import com.nlu.db.ConnectionPool;

import java.sql.Connection;

public class DataSource {
    private static ConnectionPool connectionPool = new ConnectionPool();

    public DataSource() {

    }

    public static Connection getConnection() {
//        System.out.println("Get one connection");
        return connectionPool.getConnectionFromPool();
    }

    public static void returnConnection(Connection conn) {
//        System.out.println("Release connection");
        connectionPool.returnConnectionToPool(conn);
    }
}
