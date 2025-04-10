package com.project.onlinequizbackend.services;

import java.util.List;

import com.project.onlinequizbackend.models.QuizResult;

public interface QuizResultService {
    QuizResult addQuizResult(QuizResult quizResult);
    List<QuizResult> getQuizResults();

    List<QuizResult> getQuizResultsByUser(Long userId);
}

