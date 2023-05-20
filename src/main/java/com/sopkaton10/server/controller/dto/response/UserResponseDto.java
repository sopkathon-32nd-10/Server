package com.sopkaton10.server.controller.dto.response;

import com.sopkaton10.server.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@Getter
@AllArgsConstructor
@Builder
public class UserResponseDto {
    private String name;
    private String birth;
    private String nationality;
    private String profileImg;
    private String workspace;
    private Long workingMonths;

    public static UserResponseDto of(User user) {
        String birth = user.getBirth().format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        Long workingMonths = Period.between(user.getEmploymentDate(), LocalDate.now()).toTotalMonths();

        return UserResponseDto.builder()
                .name(user.getName())
                .birth(birth)
                .nationality(user.getNationality())
                .profileImg(user.getProfileImg())
                .workspace(user.getWorkspace())
                .workingMonths(workingMonths)
                .build();
    }
}
