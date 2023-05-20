package com.sopkaton10.server.controller.dto.response;

import com.sopkaton10.server.domain.Requirement;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RequirementCheckResponseDto {

    private Long id;
    private boolean status;
    private RequirementResponseDto requirementResponseDto;

    public RequirementCheckResponseDto of(Long id,boolean status,RequirementResponseDto requirementResponseDto){
        return new RequirementCheckResponseDto(id,status,requirementResponseDto);
    }
}
