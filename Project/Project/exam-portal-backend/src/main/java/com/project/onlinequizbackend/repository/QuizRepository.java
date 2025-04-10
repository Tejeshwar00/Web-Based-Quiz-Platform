package com.project.onlinequizbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onlinequizbackend.models.Category;
import com.project.onlinequizbackend.models.Quiz;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    List<Quiz> findByCategory(Category category);
}
