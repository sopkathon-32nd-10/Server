package com.sopkaton10.server.controller;

import com.sopkaton10.server.common.dto.ApiResponse;
import com.sopkaton10.server.controller.dto.response.UserResponseDto;
import com.sopkaton10.server.exception.Success;
import com.sopkaton10.server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
}
