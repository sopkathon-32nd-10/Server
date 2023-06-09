package com.sopkaton10.server.controller;

import com.sopkaton10.server.common.dto.ApiResponse;
import com.sopkaton10.server.controller.dto.request.PatchRequestDto;
import com.sopkaton10.server.controller.dto.request.RequireCheckRequestDto;
import com.sopkaton10.server.controller.dto.response.CheckListResponseDto;
import com.sopkaton10.server.controller.dto.response.RequirementCheckResponseDto;
import com.sopkaton10.server.exception.Success;
import com.sopkaton10.server.exception.Error;
import com.sopkaton10.server.service.RequirementCheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RequireController {

    private final RequirementCheckService requirementCheckService;

    @GetMapping("/checklist")
    public ApiResponse<CheckListResponseDto> getChecklist(@RequestParam(required = false) final Long userId){
        if(userId==null){
            return ApiResponse.error(Error.REQUEST_VALIDATION_EXCEPTION);
        }
        CheckListResponseDto requireList=requirementCheckService.getRequire(userId);

        return ApiResponse.success(Success.GET_SUCCESS,requireList);
    }

    @PatchMapping("/checklist")
    public ApiResponse patchChecklist(@RequestParam(required = false) final Long userId,@RequestBody RequireCheckRequestDto require){


        requirementCheckService.fixStatus(require,userId);


        return ApiResponse.success(Success.PATCH_SUCCESS);
    }
}
