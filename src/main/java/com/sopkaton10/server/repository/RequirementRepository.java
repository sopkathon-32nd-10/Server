package com.sopkaton10.server.repository;

import com.sopkaton10.server.domain.Requirement;
import com.sopkaton10.server.domain.RequirementCheck;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface RequirementRepository extends Repository<Requirement,Long> {

    void save(Requirement requirement);

    List<Requirement> findAll();

    Requirement findById(Long id);
}
