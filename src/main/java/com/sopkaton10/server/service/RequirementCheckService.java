package com.sopkaton10.server.service;

import com.sopkaton10.server.controller.dto.request.RequireCheckRequestDto;
import com.sopkaton10.server.controller.dto.response.RequirementCheckResponseDto;
import com.sopkaton10.server.controller.dto.response.RequirementResponseDto;
import com.sopkaton10.server.domain.Requirement;
import com.sopkaton10.server.domain.User;
import com.sopkaton10.server.domain.RequirementCheck;
import com.sopkaton10.server.exception.model.NotFoundException;
import com.sopkaton10.server.repository.RequirementCheckRepository;
import com.sopkaton10.server.repository.UserRepository;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static com.sopkaton10.server.exception.Error.NOT_FOUND_USER_EXCEPTION;
import static com.sopkaton10.server.exception.Error.REQUEST_VALIDATION_EXCEPTION;

@Service
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class RequirementCheckService {
    private final RequirementCheckRepository requirementCheckRepository;
    private final UserRepository userRepository;
    public List<RequirementCheckResponseDto> getRequire(Long userId){
        User user=userRepository.findById(userId).orElseThrow(() -> new NotFoundException(NOT_FOUND_USER_EXCEPTION, NOT_FOUND_USER_EXCEPTION.getMessage()));

        List<RequirementCheck> checkList=requirementCheckRepository.findAllByUser(user);
        List<RequirementCheckResponseDto> requireList=new ArrayList<>();
        for (RequirementCheck requirementcheck:checkList
             ) {
            Requirement requirement=requirementcheck.getRequirement();
            requireList.add(RequirementCheckResponseDto.of(requirementcheck.getId(),requirementcheck.isStatus(), RequirementResponseDto.of(requirement.getId(),requirement.getContent(),requirement.getTitle())));
        }
        return requireList;
    }

    @Transactional
    public void fixStatus(RequireCheckRequestDto requireCheckRequestDto,Long userId){
        User user=userRepository.findById(userId).orElseThrow(() -> new NotFoundException(NOT_FOUND_USER_EXCEPTION, NOT_FOUND_USER_EXCEPTION.getMessage()));
        RequirementCheck requirementCheck=requirementCheckRepository.findByUserAndId(user,requireCheckRequestDto.getCheckId()).orElseThrow(() -> new NotFoundException(REQUEST_VALIDATION_EXCEPTION, "유효하지 않은 질문 ID 값입니다."));
        requirementCheck.setStatus(requireCheckRequestDto.isStatus());
        requirementCheckRepository.save(requirementCheck);
    }
}
