package com.example.tobyspringact1.First.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class NUserDao extends AbstractUserDao{
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        return null;
    }
}
