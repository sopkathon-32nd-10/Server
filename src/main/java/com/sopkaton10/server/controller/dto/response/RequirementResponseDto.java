package com.sopkaton10.server.controller.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RequirementResponseDto {
    private Long id;
    private String url;
    private String content;

    public static RequirementResponseDto of(Long id,String url,String content){
        return new RequirementResponseDto(id,url,content);
    }
}
