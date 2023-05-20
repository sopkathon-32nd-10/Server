package com.sopkaton10.server.controller.dto.response;

import lombok.*;

@Getter
@AllArgsConstructor
@Builder
@Setter
public class WorkStandardResponseDto {
    private String stdResult;
    private String stdResultImg;
    private boolean workingHoursStd;
    private int workingHours;
    private boolean wageStd;
    private int wage;

    public WorkStandardResponseDto() {
    }
}
