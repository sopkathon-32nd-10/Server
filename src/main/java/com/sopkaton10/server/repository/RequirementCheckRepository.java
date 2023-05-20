package com.sopkaton10.server.repository;

import com.sopkaton10.server.domain.RequirementCheck;
import com.sopkaton10.server.domain.User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface RequirementCheckRepository extends Repository<RequirementCheck,Long> {

    void save(RequirementCheck requirementCheck);

    RequirementCheck findByUserAndId(User user,Long id);

    List<RequirementCheck> findAllByUser(User user);
}
