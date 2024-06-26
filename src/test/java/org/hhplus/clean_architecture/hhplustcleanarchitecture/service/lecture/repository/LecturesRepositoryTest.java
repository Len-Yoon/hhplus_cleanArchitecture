package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.repository;

import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.dto.Lectures;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LecturesRepositoryTest {

    private static final Logger log = LoggerFactory.getLogger(LecturesRepositoryTest.class);
    @Autowired
    LecturesRepository lecturesRepository;

    @Test
    @DisplayName("데이터 입력 테스트")
    void insertTestData() {
        Lectures lectures = new Lectures();
        lectures.setLectureId(1);
        lectures.setLectureName("레이어드 아키텍처");
        lecturesRepository.save(lectures);

        lectures = new Lectures();
        lectures.setLectureId(2);
        lectures.setLectureName("TDD");
        lecturesRepository.save(lectures);

        lectures = new Lectures();
        lectures.setLectureId(3);
        lectures.setLectureName("클린 아키텍처");
        lecturesRepository.save(lectures);

    }

    @Test
    @DisplayName("특강 리스트 조회")
    void findAllTest() {
        List<Lectures> lecturesList = lecturesRepository.findAll();
    }

    @Test
    @DisplayName("특강 유무 조회")
    void findByLectureId() {
        int lectureId = 2;
        Lectures lecture = lecturesRepository.findByLectureId(lectureId);
    }
}