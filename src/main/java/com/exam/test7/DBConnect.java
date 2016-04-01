package com.exam.test7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private static final String URL = "jdbc:postgresql://localhost:5432/exam";
    private static final String USER = "postgres";
    private static final String PASSWORD = "root";

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public DBConnect() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
