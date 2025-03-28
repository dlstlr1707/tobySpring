package com.example.tobyspringact1.First;

import com.example.tobyspringact1.First.dao.UserDao;
import com.example.tobyspringact1.First.domain.User;

import java.sql.SQLException;


public class UserMain1 {

    public static void main(String[] args) {
        try {
            UserDao dao = new UserDao();

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
}
