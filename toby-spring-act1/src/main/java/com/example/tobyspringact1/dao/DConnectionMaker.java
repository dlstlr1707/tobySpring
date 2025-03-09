package com.example.tobyspringact1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {
    private final String url = "jdbc:mysql://localhost:3306/toby_spring";

    private final String userName = "root";

    private final String password = "1234";

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection c = DriverManager.getConnection(url, userName, password);
        return c;
    }
}
