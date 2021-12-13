package com.sparta.team9back.repository;

import com.sparta.team9back.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
