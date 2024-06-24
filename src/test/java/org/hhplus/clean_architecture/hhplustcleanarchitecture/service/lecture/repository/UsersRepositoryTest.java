package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.repository;

import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.dto.Lectures;
import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.dto.Users;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UsersRepositoryTest {

    private static final Logger log = LoggerFactory.getLogger(UsersRepositoryTest.class);
    @Autowired
    UsersRepository usersRepository;

    @Test
    @DisplayName("유저 조회 테스트")
    void findAllUsers() {
        List<Users> UsersList = usersRepository.findAll();
    }

    @Test
    @DisplayName("UserId 유무 체크")
    void countByUserIdAndUserName() {
        int userId = 1;
        String userName = "홍길동";

        int count = usersRepository.countByUserIdAndUserName(userId, userName);

        log.info("count == " + count);
    }
}