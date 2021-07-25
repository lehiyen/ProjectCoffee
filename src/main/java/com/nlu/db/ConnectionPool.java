package com.nlu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.nlu.config.DBConfiguration.*;

public class ConnectionPool {
    public static List<Connection> availableConnections = new ArrayList<>();

    public ConnectionPool() {
        this.initConnectionPool();
    }

    private Connection createConnection() {
        try {
//            Class.forName(DB_DRIVER);
//            Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
//            return connection;
            String dbUrl = System.getenv("JDBC_DATABASE_URL");
            return DriverManager.getConnection(dbUrl);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void initConnectionPool() {
        while (isConnectionPoolFull() == false) {
            Connection connection = createConnection();
            availableConnections.add(connection);
        }
    }

    private synchronized boolean isConnectionPoolFull() {
        if (availableConnections.size() < DB_MAX_CONNECTION) {
            return false;
        }
        return true;
    }


    //get connection from pool
    public synchronized Connection getConnectionFromPool() {
        Connection connection = null;
            System.out.println(availableConnections.size());
            connection = availableConnections.get(0);
            availableConnections.remove(0);
            return connection;

    }
//
//    return connection to pool
    public synchronized void returnConnectionToPool(Connection connection) {
        availableConnections.add(connection);
    }
}
