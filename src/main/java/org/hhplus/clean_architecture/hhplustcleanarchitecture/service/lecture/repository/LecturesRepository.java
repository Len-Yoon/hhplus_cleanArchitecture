package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.repository;

import jakarta.persistence.LockModeType;
import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.dto.Lectures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

public interface LecturesRepository extends JpaRepository<Lectures, Integer> {

    //특강 리스트 조회
    @Lock(LockModeType.OPTIMISTIC) //락 모드 설정
    Lectures findByLectureId(int lectureId);
}
