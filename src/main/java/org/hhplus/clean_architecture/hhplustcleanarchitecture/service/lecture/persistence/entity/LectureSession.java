package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.persistence.entity;

import com.hhp.lectureapp.common.BaseEntity;
import com.hhp.lectureapp.lecture.business.domain.LectureSessionDomain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class LectureSession extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long lectureId;

    private int applicationLimit;

    private int currentApplications = 0;

    private boolean isFull = false;

    private LocalDateTime openedAt;

    private LocalDateTime createdAt;

    public LectureSessionDomain toDomain() {
        return new LectureSessionDomain(this.id, this.lectureId, this.applicationLimit, this.currentApplications, this.isFull, this.openedAt, this.createdAt);
    }

}
