package com.sopkaton10.server.service;

import com.sopkaton10.server.controller.dto.response.UserResponseDto;
import com.sopkaton10.server.domain.User;
import com.sopkaton10.server.exception.model.NotFoundException;
import com.sopkaton10.server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.sopkaton10.server.exception.Error.NOT_FOUND_USER_EXCEPTION;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserResponseDto getUserInfo(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new NotFoundException(NOT_FOUND_USER_EXCEPTION, NOT_FOUND_USER_EXCEPTION.getMessage()));
        return UserResponseDto.of(user);
    }
}
