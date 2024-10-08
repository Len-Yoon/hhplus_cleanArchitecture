package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.business.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class LectureDomain {
    private long id;
    private String title;
    private LocalDateTime createdAt;
}
