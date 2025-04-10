package com.project.onlinequizbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onlinequizbackend.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
