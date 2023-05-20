package com.sopkaton10.server.domain;

import lombok.AccessLevel;
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

    private boolean status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "requirement_id")
    private Requirement requirement;


}
