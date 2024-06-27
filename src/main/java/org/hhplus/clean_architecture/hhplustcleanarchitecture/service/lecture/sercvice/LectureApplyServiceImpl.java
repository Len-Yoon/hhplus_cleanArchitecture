package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.sercvice;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.dto.LectureHistory;
import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.dto.Lectures;
import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.repository.LectureHistoryRepository;
import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.repository.LecturesRepository;
import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class LectureApplyServiceImpl implements LectureApplyService {

    private final LectureHistoryRepository lectureHistoryRepository;
    private final LecturesRepository lecturesRepository;
    private final UsersRepository usersRepository;

    @Override
    public List<Lectures> checkLectures() {

        return lecturesRepository.findAll();
    }

    @Override
    @Transactional
    public void applyLecture(int lectureId, int userId) {

        Lectures lectures = lecturesRepository.findByLectureId(lectureId);
        List<LectureHistory> history = lectureHistoryRepository.findAllByLectureId(lectureId);
        LectureHistory alreadyAppliedCheck = lectureHistoryRepository.findByUserIdAndLectureId(userId, lectureId);

        LocalDate now = LocalDate.of(2024,6,26);
        LocalDate applyDate = LocalDate.of(2024,6,26);

        if(lectures == null) {
            throw new NoSuchElementException("해당 특강이 존재하지 않습니다.");
        } else if (history.size() > 30) {
            throw  new RuntimeException("수용가능한 인원을 초과하였습니다.");
        } else if (alreadyAppliedCheck != null) {
            throw new IllegalArgumentException("이미 신청한 강의 입니다.");
        } else if (!now.isEqual(applyDate)) {
            throw new RuntimeException("강의 신청 가능 기간이 아닙니다.");
        } else {
            LectureHistory lectureHistory = new LectureHistory();
            lectureHistory.setLectureId(lectureId);
            lectureHistory.setUserId(userId);
            lectureHistory.setApply_date(LocalDateTime.now());

            lectureHistoryRepository.save(lectureHistory);

            isApplyComplete(lectureId, userId);
        }
    }

    @Override
    @Transactional
    public boolean isApplyComplete(int lectureId, int userId) {

        try {
            LectureHistory applyInfo = lectureHistoryRepository.findByUserIdAndLectureId(lectureId, userId);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    @Override
    public List<LectureHistory> appliedList(int userId) {
        return lectureHistoryRepository.findAllByUserId(userId);
    }
}
