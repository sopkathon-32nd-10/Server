package com.sopkaton10.server.controller.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RequirementResponseDto {
    private Long id;
    private String title;
    private String content;

    public static RequirementResponseDto of(Long id,String content,String title){
        return new RequirementResponseDto(id,title,content);
    }
}
