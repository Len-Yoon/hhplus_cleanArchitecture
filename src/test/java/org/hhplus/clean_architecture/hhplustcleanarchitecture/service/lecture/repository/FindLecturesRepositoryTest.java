package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.repository;

import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.dto.Lectures;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FindLecturesRepositoryTest {

    private static final Logger log = LoggerFactory.getLogger(FindLecturesRepositoryTest.class);
    @Autowired
    LecturesRepository findLecturesRepository;

    @Test
    @DisplayName("특강 리스트 조회 테스트")
    void findAllLectures() {
        List<Lectures> lecturesList = findLecturesRepository.findAll();
        for(Lectures L : lecturesList) log.info("LecturesList ==" + L.getLectureId() + "  |  " + L.getLectureName());
    }


}