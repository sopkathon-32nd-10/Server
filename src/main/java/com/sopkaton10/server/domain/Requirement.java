package com.sopkaton10.server.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Requirement {

    @Id
    @GeneratedValue
    @Column(name="requirement_id")
    private Long id;

    private String title;

    private String content;

    @Builder
    public Requirement(String title,String content){
        this.title=title;
        this.content=content;
    }
}
