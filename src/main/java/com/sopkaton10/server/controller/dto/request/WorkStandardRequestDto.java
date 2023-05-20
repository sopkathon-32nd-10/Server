package com.sopkaton10.server.controller.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class WorkStandardRequestDto {
    private int monthOfWage;
    private int workingHours;
    private int monthOfWorkingDays;
}
