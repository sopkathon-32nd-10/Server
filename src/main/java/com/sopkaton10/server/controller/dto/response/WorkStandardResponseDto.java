package com.sopkaton10.server.controller.dto.response;

import lombok.*;

@Getter
@AllArgsConstructor
@Builder
@Setter
public class WorkStandardResponseDto {
    private boolean stdResult;
    private boolean workingHoursStd;
    private int workingHours;
    private boolean wageStd;
    private int wage;

    public WorkStandardResponseDto() {
    }
}
