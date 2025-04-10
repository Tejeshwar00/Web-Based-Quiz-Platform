package com.project.onlinequizbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onlinequizbackend.models.Role;

public interface RoleRepository extends JpaRepository<Role, String> {
}
