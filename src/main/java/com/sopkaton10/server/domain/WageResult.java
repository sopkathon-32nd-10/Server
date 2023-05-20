package com.sopkaton10.server.domain;

import lombok.Getter;

@Getter
public enum WageResult {

    /// TODO 이름과 이미지 url 확정 후 수정
    SUCCESS("성공", "png"),
    FAIL("실패", "png");

    private final String name;
    private final String img;

    WageResult(String name, String img) {
        this.name = name;
        this.img = img;
    }
}
