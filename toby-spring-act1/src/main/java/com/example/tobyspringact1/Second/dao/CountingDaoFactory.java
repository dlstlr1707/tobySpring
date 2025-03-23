package com.example.tobyspringact1.Second.dao;

import com.example.tobyspringact1.First.dao.ConnectionMaker;
import com.example.tobyspringact1.First.dao.DConnectionMaker;
import com.example.tobyspringact1.First.dao.UserDaoV3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CountingDaoFactory {
    @Bean
    public UserDaoV3 userDao(){
        return new UserDaoV3(connectionMaker());
    }

    @Bean
    public ConnectionMaker connectionMaker(){
        return new CountingConnectionMaker(realConnectionMaker());
    }

    @Bean
    public ConnectionMaker realConnectionMaker(){
        return new DConnectionMaker();
    }

    // 리스트 1-34
    @Bean
    public UserDao userDao(){
        UserDao userDao = new UserDao();
        userDao.setConnectionMaker(connectionMaker());
        return userDao;
    }

    // 리스트 1-35
    @Bean
    public ConnectionMaker
    connectionMaker(){
        return new DConnectionMaker();
    }
}
