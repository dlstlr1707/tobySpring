package com.example.tobyspringact1;

import com.example.tobyspringact1.dao.ConnectionMaker;
import com.example.tobyspringact1.dao.DConnectionMaker;
import com.example.tobyspringact1.dao.UserDaoV3;
import com.example.tobyspringact1.domain.User;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) {
        try {
            ConnectionMaker connectionMaker = new DConnectionMaker();

            UserDaoV3 dao = new UserDaoV3(connectionMaker);

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
