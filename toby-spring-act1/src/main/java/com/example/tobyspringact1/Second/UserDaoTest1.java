package com.example.tobyspringact1.Second;

import com.example.tobyspringact1.First.dao.UserDaoV3;
import com.example.tobyspringact1.First.domain.User;
import com.example.tobyspringact1.Second.dao.DaoFactory;

import java.sql.SQLException;

public class UserDaoTest1 {
    public static void main(String[] args) {
        try{
            // 리스트 1-15
            UserDaoV3 dao = new DaoFactory().userDao();

            User user = new User();
            user.setId("whiteship4");
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
