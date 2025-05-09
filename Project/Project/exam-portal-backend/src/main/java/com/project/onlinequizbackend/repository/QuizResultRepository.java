package com.project.onlinequizbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onlinequizbackend.models.QuizResult;

import java.util.List;

public interface QuizResultRepository extends JpaRepository<QuizResult, Long> {
    List<QuizResult> findByUserId(Long userId);
}
