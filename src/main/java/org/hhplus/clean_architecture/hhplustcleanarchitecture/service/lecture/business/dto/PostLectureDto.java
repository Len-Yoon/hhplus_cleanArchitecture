package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.business.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostLectureDto {
    private long sessionId;
    private String title;
    private int userCount;

}
