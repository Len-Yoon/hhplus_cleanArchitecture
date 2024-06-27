package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.business;

import com.hhp.lectureapp.lecture.business.domain.LectureDomain;

import java.util.Optional;

public interface LectureRepository{
    Optional<LectureDomain> findById(Long id);
}
