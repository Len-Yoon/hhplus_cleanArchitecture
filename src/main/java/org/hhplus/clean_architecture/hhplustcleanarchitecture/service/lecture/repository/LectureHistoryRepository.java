package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.repository;

import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.dto.LectureHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LectureHistoryRepository extends JpaRepository<LectureHistory, Integer> {

    //특정 특강 신청자 수 확인
    List<LectureHistory> findAllByLectureId(int lectureId);

    //특강 신청 성공 유무 확인
    LectureHistory findByUserIdAndLectureId(int userId, int lectureId);

    //개개인 신청자 히스토리 조회
    List<LectureHistory> findAllByUserId(int userId);

}
