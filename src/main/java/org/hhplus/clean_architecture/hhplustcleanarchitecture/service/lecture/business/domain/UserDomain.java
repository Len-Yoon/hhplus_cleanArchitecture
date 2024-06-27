package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.business.domain;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UserDomain {
    private long id;

    private LocalDateTime createdAt;

    public UserDomain(long id, LocalDateTime createdAt) {
        this.id = id;
        this.createdAt = createdAt;
    }
}

