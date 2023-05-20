package com.sopkaton10.server.service;

import com.sopkaton10.server.controller.dto.response.UserResponseDto;
import com.sopkaton10.server.controller.dto.response.WorkStandardResponseDto;
import com.sopkaton10.server.domain.User;
import com.sopkaton10.server.domain.WageResult;
import com.sopkaton10.server.exception.model.NotFoundException;
import com.sopkaton10.server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static com.sopkaton10.server.exception.Error.NOT_FOUND_USER_EXCEPTION;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserResponseDto getUserInfo(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new NotFoundException(NOT_FOUND_USER_EXCEPTION, NOT_FOUND_USER_EXCEPTION.getMessage()));
        String birth = user.getBirth().format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        Long workingMonths = Period.between(user.getEmploymentDate(), LocalDate.now()).toTotalMonths();
        return UserResponseDto.of(user.getName(), birth, user.getNationality(), user.getProfileImg(), user.getWorkspace(), workingMonths);
    }

    public WorkStandardResponseDto postWorkStandard(int monthOfWage, int workingHours, int monthOfWorkingDays) {
        WorkStandardResponseDto response = new WorkStandardResponseDto();
        // 근로시간
        int weekOfWorkingHours = (monthOfWorkingDays/4)*workingHours;
        int monthOfWorkingHours = workingHours*monthOfWorkingDays;
        response.setWorkingHours(monthOfWorkingHours);
        response.setWorkingHoursStd(weekOfWorkingHours <= 52);

        // 환산시급
        int hourOfWage = monthOfWage/monthOfWorkingHours;
        int standardWage = 9620;
        response.setWage(hourOfWage);
        response.setWageStd(hourOfWage>=standardWage);

        if(response.isWorkingHoursStd() && response.isWageStd() ) {
            response.setStdResult(WageResult.SUCCESS.getName());
            response.setStdResultImg(WageResult.SUCCESS.getImg());
        } else {
            response.setStdResult(WageResult.FAIL.getName());
            response.setStdResultImg(WageResult.FAIL.getImg());
        }
        return response;
    }
}
