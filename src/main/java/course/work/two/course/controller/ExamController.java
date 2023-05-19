package course.work.two.course.controller;

import course.work.two.course.model.Question;
import course.work.two.course.service.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;

    }

    @GetMapping("/get/{amount}")
    public Collection<Question> getQuestion(@PathVariable Integer amount) {
        return examinerService.getQuestions(amount);
    }
}
