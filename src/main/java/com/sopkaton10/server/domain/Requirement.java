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

    private String url;

    private String name;

    private String content;

    @Builder
    public Requirement(String url,String name,String content){
        this.url=url;
        this.name=name;
        this.content=content;
    }
}
