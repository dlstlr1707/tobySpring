package com.example.tobyspringact1.Second;

import com.example.tobyspringact1.First.dao.UserDaoV3;
import com.example.tobyspringact1.First.domain.User;
import com.example.tobyspringact1.Second.dao.DaoFactory;
import com.example.tobyspringact1.Second.dao.SpringDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class SpringUserDaoTest {
    /*
    // 리스트 1-19
    public static void main(String[] args) {
        try{
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringDaoFactory.class);

            UserDaoV3 dao = context.getBean("userDao", UserDaoV3.class);

            User user = new User();
            user.setId("whiteship3");
            user.setName("백기선");
            user.setPassword("married");

            dao.add(user);

            System.out.println(user.getId() + " 등록 성공");

            User user2 = dao.get(user.getId());
            System.out.println(user2.getName());
            System.out.println(user2.getPassword());

            System.out.println(user2.getId() + " 조회 성공");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
     */
    /*
    // 리스트 1-20
    public static void main(String[] args) {
        SpringDaoFactory factory = new SpringDaoFactory();
        UserDaoV3 dao1 = factory.userDao();
        UserDaoV3 dao2 = factory.userDao();

        System.out.println("dao1 is : " + dao1);
        System.out.println("dao2 is : " + dao2);
    }
     */
    // 리스트 1-21
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringDaoFactory.class);

        UserDaoV3 dao3 = context.getBean("userDao", UserDaoV3.class);
        UserDaoV3 dao4 = context.getBean("userDao", UserDaoV3.class);

        System.out.println("dao3 is : " + dao3);
        System.out.println("dao4 is : " + dao4);
    }
}
