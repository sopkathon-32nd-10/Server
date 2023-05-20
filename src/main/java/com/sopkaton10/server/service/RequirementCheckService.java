package com.sopkaton10.server.service;

import com.sopkaton10.server.controller.dto.response.RequirementCheckResponseDto;
import com.sopkaton10.server.controller.dto.response.RequirementResponseDto;
import com.sopkaton10.server.domain.Requirement;
import com.sopkaton10.server.domain.User;
import com.sopkaton10.server.domain.RequirementCheck;
import com.sopkaton10.server.repository.RequirementCheckRepository;
import com.sopkaton10.server.repository.UserRepository;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class RequirementCheckService {
    private final RequirementCheckRepository requirementCheckRepository;
    private final UserRepository userRepository;
    public List<RequirementCheckResponseDto> getRequire(Long userId){
        User user=userRepository.findById(userId).get();
        List<RequirementCheck> checkList=requirementCheckRepository.findAllByUser(user);
        List<RequirementCheckResponseDto> requireList=new ArrayList<>();
        for (RequirementCheck requirementcheck:checkList
             ) {
            Requirement requirement=requirementcheck.getRequirement();
            requireList.add(RequirementCheckResponseDto.of(requirementcheck.getId(),requirementcheck.getUser().isWorkStatus(), RequirementResponseDto.of(requirement.getId(),requirement.getContent(),requirement.getTitle())));
        }
        return requireList;
    }
}
