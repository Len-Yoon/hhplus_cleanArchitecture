package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.entity;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class LectureApply {
    @Id
    private String user_id;
    private int lecture_id;
    private String lecture_name;
    private Date apply_time;
}
