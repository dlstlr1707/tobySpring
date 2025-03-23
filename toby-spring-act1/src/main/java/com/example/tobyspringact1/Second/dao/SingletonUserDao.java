package com.example.tobyspringact1.Second.dao;

import com.example.tobyspringact1.First.dao.ConnectionMaker;
import com.example.tobyspringact1.First.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SingletonUserDao {
    /*
    // 리스트 1-22
    private static SingletonUserDao INSTANCE;

    private ConnectionMaker connectionMaker;

    private SingletonUserDao(ConnectionMaker connectionMaker){
        this.connectionMaker = connectionMaker;
    }

    public static synchronized SingletonUserDao getInstance(){
        if(INSTANCE == null) INSTANCE = new SingletonUserDao(???);
        return INSTANCE;
    }
     */

    // 리스트 1-23
    private ConnectionMaker connectionMaker;
    private Connection c;
    private User user;

    public User get(String id) throws SQLException, ClassNotFoundException {
        this.c = connectionMaker.makeConnection();

        PreparedStatement ps = c.prepareStatement("select * from users where id=?");
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        rs.next();

        this.user = new User();
        this.user.setId(rs.getString("id"));
        this.user.setName(rs.getString("name"));
        this.user.setPassword(rs.getString("password"));

        rs.close();
        ps.close();
        c.close();

        return this.user;
    }
}
