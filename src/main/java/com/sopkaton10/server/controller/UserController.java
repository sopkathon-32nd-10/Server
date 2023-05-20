package com.sopkaton10.server.controller;

import com.sopkaton10.server.common.dto.ApiResponse;
import com.sopkaton10.server.controller.dto.request.WorkStandardRequestDto;
import com.sopkaton10.server.controller.dto.response.UserResponseDto;
import com.sopkaton10.server.exception.Success;
import com.sopkaton10.server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RequestMapping("/user")
@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    /**
     * [GET] 홈 화면
     */
    @GetMapping("/{userId}")
    public ApiResponse<UserResponseDto> getUserInfo(@PathVariable Long userId) {
        return ApiResponse.success(Success.GET_SUCCESS, userService.getUserInfo(userId));
    }

    /**
     * [POST] 근로 기준 적합 계산
     */
    @PostMapping
    public ApiResponse postWorkStandard(@RequestBody @Valid final WorkStandardRequestDto request) {
        return ApiResponse.success(Success.GET_SUCCESS, userService.postWorkStandard(request.getMonthOfWage(),
                                                                                    request.getWorkingHours(),
                                                                                    request.getMonthOfWorkingDays()));
    }
}
