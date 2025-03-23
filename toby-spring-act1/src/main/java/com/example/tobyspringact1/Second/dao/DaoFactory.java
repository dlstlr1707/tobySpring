package com.example.tobyspringact1.Second.dao;

import com.example.tobyspringact1.First.dao.ConnectionMaker;
import com.example.tobyspringact1.First.dao.DConnectionMaker;
import com.example.tobyspringact1.First.dao.UserDaoV3;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class DaoFactory {

    // 리스트 1-14
    public UserDaoV3 userDao() {
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDaoV3 userDao = new UserDaoV3(connectionMaker);
        return userDao;
    }
    /*
    // 리스트 1-16
    public UserDaoV3 userDao(){
        return new UserDaoV3(new DConnectionMaker());
    }
    public AccountDao accountDao(){
        return new AccountDao(new DConnectionMaker());
    }
    public MessageDao messageDao(){
        return new MessageDao(new DConnectionMaker());
    }
     */
    /*
    // 리스트 1-17 => 1-16수정버전
    public UserDaoV3 userDao(){
        return new UserDaoV3(connectionMaker());
    }
    public AccountDao accountDao(){
        return new AccountDao(connectionMaker());
    }
    public MessageDao messageDao(){
        return new MessageDao(connectionMaker());
    }
    public ConnectionMaker connectionMaker(){
        return new DConnectionMaker();
    }
     */
    // 리스트 1-43
    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();

        dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://localhost/springbook");
        dataSource.setUsername("spring");
        dataSource.setPassword("book");

        return datasource;
    }

    // 리스트 1-44
    @Bean
    public UserDao userDao(){
        UserDao userDao = new UserDao();
        userDao.setDataSource(dataSource());
        return userDao;
    }
}
