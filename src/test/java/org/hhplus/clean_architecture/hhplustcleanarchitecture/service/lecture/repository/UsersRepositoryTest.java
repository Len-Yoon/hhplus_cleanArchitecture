package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.repository;

import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.dto.Users;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UsersRepositoryTest {

    private static final Logger log = LoggerFactory.getLogger(UsersRepositoryTest.class);

    @Autowired
    UsersRepository usersRepository;

    @Test
    @DisplayName("데이터 입력 테스트")
    void insertTestData() {
        Users users = new Users();
        users.setUserId(1);
        users.setUserName("홍길동");
        usersRepository.save(users);

        users = new Users();
        users.setUserId(2);
        users.setUserName("임꺽정");
        usersRepository.save(users);

        users = new Users();
        users.setUserId(3);
        users.setUserName("이순신");
        usersRepository.save(users);

        users = new Users();
        users.setUserId(4);
        users.setUserName("을지문덕");
        usersRepository.save(users);
    }

    @Test
    @DisplayName("User 데이터 조회")
    void findAllTest() {
        List<Users> usersList = usersRepository.findAll();

    }

    @Test
    @DisplayName("특정 User 조회")
    void findByUserId() {
        int userId = 1;

        Users userInfo = usersRepository.findByUserId(1);
    }
}