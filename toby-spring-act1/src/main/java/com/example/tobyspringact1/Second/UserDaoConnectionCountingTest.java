package com.example.tobyspringact1.Second;

import com.example.tobyspringact1.Second.dao.CountingConnectionMaker;
import com.example.tobyspringact1.Second.dao.CountingDaoFactory;
import com.example.tobyspringact1.Second.dao.SpringDaoFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserDaoConnectionCountingTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CountingDaoFactory.class);
        SpringDaoFactory dao = context.getBean("userDao", SpringDaoFactory.class);

        CountingConnectionMaker ccm = context.getBean("connectionMaker",CountingConnectionMaker.class);

        System.out.println("ConnectionMaker: " + ccm.getCounter());
    }
}
