package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.repository;

import org.apache.catalina.User;
import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.dto.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UsersRepository extends JpaRepository<Users, Integer> {

    Users findByUserIdAndUserName(int userId, String userName);

    int countByUserIdAndUserName(int userId, String userName);
}
