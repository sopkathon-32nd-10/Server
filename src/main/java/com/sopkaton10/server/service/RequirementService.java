package com.sopkaton10.server.service;

import com.sopkaton10.server.controller.dto.response.RequirementResponseDto;
import com.sopkaton10.server.domain.Requirement;
import com.sopkaton10.server.repository.RequirementRepository;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class RequirementService {

    private final RequirementRepository requirementRepository;

    public RequirementResponseDto getRequirement(Long id){
        Requirement requirement=requirementRepository.findById(id);
        return RequirementResponseDto.of(requirement.getId(),requirement.getContent(),requirement.getTitle());
    }

}
