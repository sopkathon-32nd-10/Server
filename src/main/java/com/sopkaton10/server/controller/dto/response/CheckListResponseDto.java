package com.sopkaton10.server.controller.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CheckListResponseDto {

    private int progress;
    private List<RequirementCheckResponseDto> checkListData;

    public static CheckListResponseDto of(int progress,List<RequirementCheckResponseDto> checkListData){
        return new CheckListResponseDto(progress,checkListData);
    }
}
