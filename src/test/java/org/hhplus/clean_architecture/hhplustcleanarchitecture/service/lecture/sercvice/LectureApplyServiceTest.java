package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.sercvice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LectureApplyServiceTest {

    @Autowired
    LectureApplyService lectureApplyService;

    @Test
    @DisplayName("특강 신청 로직 테스트")
    void applyLecture() {
        int lectureId = 2;
        int userId = 1;

        lectureApplyService.applyLecture(lectureId, userId);
    }

    @Test
    @DisplayName("특강 신청 결과 확인")
    void isApplyComplete() {
        int lectureId = 2;
        int userId = 1;

        lectureApplyService.isApplyComplete(lectureId, userId);
    }

    @Test
    void appliedList() {
        int userId = 1;
        lectureApplyService.appliedList(userId);
    }
}