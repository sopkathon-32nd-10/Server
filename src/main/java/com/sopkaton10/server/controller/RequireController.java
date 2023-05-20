package com.sopkaton10.server.controller;

import com.sopkaton10.server.common.dto.ApiResponse;
import com.sopkaton10.server.controller.dto.response.RequirementCheckResponseDto;
import com.sopkaton10.server.exception.Success;
import com.sopkaton10.server.exception.Error;
import com.sopkaton10.server.service.RequirementCheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RequireController {

    private final RequirementCheckService requirementCheckService;

    @GetMapping("/checklist")
    public ApiResponse<List<RequirementCheckResponseDto>> getChecklist(@RequestParam(required = false) final Long userId){
        if(userId==null){
            return ApiResponse.error(Error.REQUEST_VALIDATION_EXCEPTION);
        }
        List<RequirementCheckResponseDto> requireList=requirementCheckService.getRequire(userId);
        if (requireList.size()==0){
            return ApiResponse.error(Error.NOT_FOUND_USER_EXCEPTION);
        }
        return ApiResponse.success(Success.GET_SUCCESS,requireList);
    }
}
