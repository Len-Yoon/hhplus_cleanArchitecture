package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.repository;

import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.dto.LectureHistory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LectureHistoryRepositoryTest {

    private static final Logger log = LoggerFactory.getLogger(LectureHistoryRepositoryTest.class);

    @Autowired
    LectureHistoryRepository lectureHistoryRepository;

    @Test
    @DisplayName("데이터 입력 테스트")
    void insertTestData() {
        LocalDateTime now = LocalDateTime.now();

        LectureHistory lectureHistory = new LectureHistory();
        lectureHistory.setLectureId(1);
        lectureHistory.setUserId(1);
        lectureHistory.setApply_date(now);
        lectureHistoryRepository.save(lectureHistory);

        lectureHistory = new LectureHistory();
        lectureHistory.setLectureId(1);
        lectureHistory.setUserId(2);
        lectureHistory.setApply_date(now);
        lectureHistoryRepository.save(lectureHistory);

        lectureHistory = new LectureHistory();
        lectureHistory.setLectureId(1);
        lectureHistory.setUserId(3);
        lectureHistory.setApply_date(now);
        lectureHistoryRepository.save(lectureHistory);

        lectureHistory = new LectureHistory();
        lectureHistory.setLectureId(1);
        lectureHistory.setUserId(4);
        lectureHistory.setApply_date(now);
        lectureHistoryRepository.save(lectureHistory);
    }

    @Test
    @DisplayName("특강 신청 데이터 조회 테스트")
    void findAllTest() {
        List<LectureHistory> histroyList = lectureHistoryRepository.findAll();
    }

    @Test
    @DisplayName("특정 특강 신청자 수 확인")
    void findAllByLectureId() {
        int lectureId = 1;

        List<LectureHistory> historyList = lectureHistoryRepository.findAllByLectureId(lectureId);
    }

    @Test
    @DisplayName("특강 신청 성공 유무 확인")
    void findByUserIdAndLectureId() {
        int userId = 1;
        int lectureId = 1;

        LectureHistory successInfo = lectureHistoryRepository.findByUserIdAndLectureId(userId, lectureId);
    }

    @Test
    @DisplayName("개개인 신청자 히스토리 조회")
    void findAllByUserId() {
        int userId = 1;

        List<LectureHistory> userHistoryList = lectureHistoryRepository.findAllByUserId(userId);
    }
}