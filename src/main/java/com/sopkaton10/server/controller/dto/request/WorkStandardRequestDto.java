package com.sopkaton10.server.controller.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class WorkStandardRequestDto {
    @NotNull
    private Integer monthOfWage;
    @NotNull
    private Integer workingHours;
    @NotNull
    private Integer monthOfWorkingDays;
}
