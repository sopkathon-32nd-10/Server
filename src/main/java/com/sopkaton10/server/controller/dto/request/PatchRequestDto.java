package com.sopkaton10.server.controller.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class PatchRequestDto {

    List<RequireCheckRequestDto> requireList;
}
