package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.common;

public record ErrorResponse (
        int statusCode,
        String msg
) {
}
