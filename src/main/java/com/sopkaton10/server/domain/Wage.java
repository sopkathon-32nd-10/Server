package com.sopkaton10.server.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Wage {
    @Id
    @GeneratedValue
    @Column(name="wage_id")
    private Long id;
}
