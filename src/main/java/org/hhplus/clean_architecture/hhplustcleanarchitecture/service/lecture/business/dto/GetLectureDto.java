package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.business.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetLectureDto{
    private long sessionId;
    private int userCount;
    private int userLimit;
}
