package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Data
@Table(name = "lectures_info")
@AllArgsConstructor
@NoArgsConstructor
public class Lectures {
    @Id
    private int lectureId;
    private String lectureName;
}
