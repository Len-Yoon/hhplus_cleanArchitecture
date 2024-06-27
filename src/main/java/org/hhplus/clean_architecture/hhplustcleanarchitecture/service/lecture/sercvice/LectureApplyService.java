package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.sercvice;

import jakarta.persistence.LockModeType;
import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.dto.LectureHistory;
import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.dto.Lectures;
import org.springframework.data.jpa.repository.Lock;

import java.util.List;

public interface LectureApplyService {

    //특강 목록 조회
    List<Lectures> checkLectures();
    //특강 신청
    void applyLecture(int lectureId, int userId);
    //특강 신청 결과 여부 조회
    boolean isApplyComplete(int lectureId, int userId);
    //특강 신청 리스트 조회
    List<LectureHistory> appliedList(int userId);
}
