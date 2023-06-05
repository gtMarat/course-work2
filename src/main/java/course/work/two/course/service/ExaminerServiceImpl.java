package course.work.two.course.service;

import course.work.two.course.exception.AmountWrongNumberException;
import course.work.two.course.model.Question;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
@SessionScope
public class ExaminerServiceImpl implements ExaminerService{
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(Integer amount) {
        Set<Question> question = new HashSet<>();
        if (amount > questionService.getAll().size() || amount < 1) {
            throw new AmountWrongNumberException();
        }
        else {
            while (question.size() < amount) {
                question.add(questionService.getRandomQuestion());
            }


            return question;
        }
    }
}
