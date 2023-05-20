package com.sopkaton10.server.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RequirementCheck {

    @Id
    @GeneratedValue
    @Column(name="requirementCheck_id")
    private Long id;

    public boolean status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "requirement_id")
    private Requirement requirement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Builder
    public RequirementCheck(boolean status,Requirement requirement,User user){
        this.requirement=requirement;
        this.status=status;
        this.user=user;
    }


}
