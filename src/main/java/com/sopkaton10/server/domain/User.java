package com.sopkaton10.server.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private Long id;

    private String name;

    private LocalDate birth;

    private String nationality;

    private String profileImg;

    private String workspace;

    private LocalDate employmentDate;

    private boolean workStatus;
}

