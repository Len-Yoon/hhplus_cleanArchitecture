package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "lectures_history")
@AllArgsConstructor
@NoArgsConstructor
public class LectureHistory {
    @Id
    private int userId;
    private int lectureId;
    private LocalDateTime apply_date;
}
