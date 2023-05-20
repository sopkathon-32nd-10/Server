package com.sopkaton10.server.service;

import com.sopkaton10.server.controller.dto.response.RequirementCheckResponseDto;
import com.sopkaton10.server.domain.RequirementCheck;
import com.sopkaton10.server.repository.RequirementCheckRepository;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class RequirementCheckService {
    private final RequirementCheckRepository requirementCheckRepository;

    public RequirementCheckResponseDto getRequire(Long userId){

        List<RequirementCheck> checkList=requirementCheckRepository.findAllByUser()
    }
}
