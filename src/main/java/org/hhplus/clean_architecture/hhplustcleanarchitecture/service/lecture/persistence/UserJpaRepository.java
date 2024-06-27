package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.persistence;

import com.hhp.lectureapp.lecture.persistence.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<Users, Long> {
}
