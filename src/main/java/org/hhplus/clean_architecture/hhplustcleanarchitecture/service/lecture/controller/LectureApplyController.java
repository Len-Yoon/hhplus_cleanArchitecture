package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.Utils;
import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.sercvice.LectureApplyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lectures")
@RequiredArgsConstructor
public class LectureApplyController {

    private final LectureApplyService lectureApplyService;

    //특강 리스트 조회
    @GetMapping("")
    public void checkLectures() {
        lectureApplyService.checkLectures();;
    }

    //특강 신청
    @PostMapping("/apply")
    public void apply(HttpServletRequest request) {
        int lectureId = Utils.checkNullByInt(request.getParameter("lectureId"));
        int userId = Utils.checkNullByInt(request.getParameter("userId"));

        lectureApplyService.applyLecture(lectureId, userId);
    }

    //신청한 특강 목록 조회
    @GetMapping("application/{userId}")
    public void application(HttpServletRequest request) {
        int userId = Utils.checkNullByInt(request.getParameter("userId"));

        lectureApplyService.appliedList(userId);
    }
}
