package course.work.two.course.service;

import course.work.two.course.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions( Integer amount);

}
