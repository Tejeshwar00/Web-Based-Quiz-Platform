package com.project.onlinequizbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onlinequizbackend.models.Question;
import com.project.onlinequizbackend.models.Quiz;

import java.util.List;


public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByQuiz(Quiz quiz);
}
