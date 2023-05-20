package com.sopkaton10.server.controller.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class RequireCheckRequestDto {

    private Long checkId;
    private Long userId;
    private boolean status;
}
