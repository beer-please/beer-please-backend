package ru.beerplease.beerplease.controller.api.v1;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
class ApiError {
    private final HttpStatus httpStatus;
    private final String message;

    ApiError(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }
}
