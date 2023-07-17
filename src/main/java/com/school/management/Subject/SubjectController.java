package com.school.management.Subject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @GetMapping("/all/")
    public List<Subject> allSubjects() {
        return List.of(new Subject());
    }

    @GetMapping("/{subjectId}")
    public List<Subject> getSubject() {
        return List.of(new Subject());
    }

    @PostMapping("/add")
    public  List<Subject> addSubject() {
        return List.of(new Subject());
    }
}
