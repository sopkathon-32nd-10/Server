package com.sopkaton10.server.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access =  AccessLevel.PRIVATE)
public enum Success {


//    **200*20

    GET_SUCCESS(HttpStatus.OK,"조회에 성공했습니다"),
    /**
     * 200 OK
     */
    GET_SUCCESS(HttpStatus.OK, "조회에 성공했습니다.");

    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}