package com.project.onlinequizbackend.services;

import java.util.List;

import com.project.onlinequizbackend.models.Question;
import com.project.onlinequizbackend.models.Quiz;

public interface QuestionService {

    Question addQuestion(Question question);

    List<Question> getQuestions();

    Question getQuestion(Long quesId);

    Question updateQuestion(Question question);

    void deleteQuestion(Long questionId);

    //Extra Methods
    List<Question> getQuestionsByQuiz(Quiz quiz);

}
