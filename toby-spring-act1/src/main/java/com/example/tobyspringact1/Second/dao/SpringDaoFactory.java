package com.example.tobyspringact1.Second.dao;

import com.example.tobyspringact1.First.dao.ConnectionMaker;
import com.example.tobyspringact1.First.dao.DConnectionMaker;
import com.example.tobyspringact1.First.dao.UserDaoV3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDaoFactory {

    @Bean(name = "userDao")
    public UserDaoV3 userDao() {
        return new UserDaoV3(connectionMaker());
    }

    @Bean
    public ConnectionMaker connectionMaker(){
        return new DConnectionMaker();
    }

    // 리스트 1-28
    @Bean
    public ConnectionMaker connectionMaker(){
        return new LocalDBConnectionMaker();
    }

    // 리스트 1-29
    @Bean
    public ConnectionMaker connectionMaker(){
        return new ProductionDBConnectionMaker();
    }
}
