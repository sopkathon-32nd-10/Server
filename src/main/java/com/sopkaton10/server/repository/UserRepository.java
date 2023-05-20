package com.sopkaton10.server.repository;

import com.sopkaton10.server.domain.User;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface UserRepository extends Repository<User, Long> {
    Optional<User> findById(Long userId);
}
