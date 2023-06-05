package course.work.two.course.service;

import course.work.two.course.model.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);

    Question add(Question question);

    Question remove(String question, String answer);
    Collection<Question> getAll();
    Question getRandomQuestion();
}

