package com.project.onlinequizbackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onlinequizbackend.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
