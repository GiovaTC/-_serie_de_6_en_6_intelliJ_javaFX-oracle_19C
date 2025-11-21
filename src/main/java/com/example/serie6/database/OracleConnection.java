package com.example.serie6.database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class OracleConnection {
    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/orcl";
    private static final String USER = "system";
    private static final String PASSWORD = "Tapiero123";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
