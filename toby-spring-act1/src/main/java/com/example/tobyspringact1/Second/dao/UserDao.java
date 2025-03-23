package com.example.tobyspringact1.Second.dao;

import com.example.tobyspringact1.First.dao.ConnectionMaker;
import com.example.tobyspringact1.First.dao.DConnectionMaker;
import com.example.tobyspringact1.First.dao.SimpleConnectionMaker;
import com.example.tobyspringact1.First.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class UserDao {
//    private ConnectionMaker connectionMaker;
//
//    // 리스트 1-24
//    public UserDao(){
//        connectionMaker = new DConnectionMaker();
//    }
//
//    // 리스트 1-25
//    public UserDao(ConnectionMaker connectionMaker){
//        this.connectionMaker = connectionMaker;
//    }
//
//    // 리스트 1-26
//    public UserDao(){
//        SpringDaoFactory daoFactory = new SpringDaoFactory();
//        this.connectionMaker = daoFactory.connectionMaker();
//    }
//
//    // 리스트 1-27
//    public UserDao(){
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringDaoFactory.class);
//        this.connectionMaker = context.getBean("connectionMaker",ConnectionMaker.class);
//    }
//
//    // 리스트 1-33
//    public void setConnectionMaker(ConnectionMaker connectionMaker){
//        this.connectionMaker = connectionMaker;
//    }
    // 리스트 1-42
    private DataSource datasource;
    public void setDataSource(DataSource datasource) {
        this.datasource = datasource;
    }
    public void add(User user) throws SQLException {
        Connection c = datasource.getConnection();
    }
    
}
