package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.business;

import com.hhp.lectureapp.lecture.business.dto.GetLectureDto;
import com.hhp.lectureapp.lecture.business.dto.PostLectureDto;

import java.util.List;

public interface LectureService {
    List<GetLectureDto> getLectureList(long userId);

    PostLectureDto applyLecture(long lectureId, long userId, long sessionId);

    Boolean isApplication(long userId, long sessionId);
}
