package course.work.two.course.controller;

import course.work.two.course.model.Question;
import course.work.two.course.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/add")
    public Question add(@RequestParam("question") String question,
                        @RequestParam("answer") String answer) {
        return questionService.add(question, answer);
    }
    @GetMapping("/remove")
    public Question remove(@RequestParam("question") String question,
                           @RequestParam("answer") String answer) {
        return questionService.remove(question, answer);
    }

    @GetMapping()
    public Collection<Question> getAll() {
        return questionService.getAll();
    }


}
