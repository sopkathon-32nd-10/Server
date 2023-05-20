package com.sopkaton10.server.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class UserResponseDto {
    private String name;
    private String birth;
    private String nationality;
    private String profileImg;
    private String workspace;
    private Long workingMonths;

    public static UserResponseDto of(String name, String birth, String nationality, String profileImg, String workspace, Long workingMonths) {
        return UserResponseDto.builder()
                .name(name)
                .birth(birth)
                .nationality(nationality)
                .profileImg(profileImg)
                .workspace(workspace)
                .workingMonths(workingMonths)
                .build();
    }
}
