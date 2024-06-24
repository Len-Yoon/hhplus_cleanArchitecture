package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@Table(name = "lectures_user")
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    private int userId;
    private String userName;
    private int count;
}
