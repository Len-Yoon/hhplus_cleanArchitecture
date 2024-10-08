package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.controller;

import lombok.RequiredArgsConstructor;
import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.business.LectureService;
import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.business.dto.GetLectureDto;
import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.business.dto.PostLectureDto;
import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.business.dto.PostRequestApplyLectureDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lecture")
@RequiredArgsConstructor
public class LectureController {

    private final LectureService lectureService;

    @GetMapping

    public ResponseEntity<List<GetLectureDto>> getLectureList(
            @RequestParam long userId
    ) {
        return new ResponseEntity<>(lectureService.getLectureList(userId), HttpStatus.OK);
    }

    @PostMapping("{lectureId}/apply")
    public ResponseEntity<PostLectureDto> applyLecture(
            @PathVariable long lectureId,
            @RequestBody PostRequestApplyLectureDto request
    ){
        return new ResponseEntity<>(lectureService.applyLecture(lectureId, request.getUserId(), request.getSessionId()), HttpStatus.OK);
    }

    @GetMapping("/application/{userId}")
    public ResponseEntity<Boolean> isApplication(
            @PathVariable long userId,
            @RequestParam long sessionId
    ) {
        return new ResponseEntity<>(lectureService.isApplication(userId, sessionId), HttpStatus.OK);
    }
}
