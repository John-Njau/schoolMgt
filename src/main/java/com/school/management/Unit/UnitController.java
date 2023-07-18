package com.school.management.Unit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class UnitController {

    @GetMapping("/all/")
    public List<Unit> allSubjects() {
        return List.of(new Unit());
    }

    @GetMapping("/{subjectId}")
    public List<Unit> getSubject() {
        return List.of(new Unit());
    }

    @PostMapping("/add")
    public  List<Unit> addSubject() {
        return List.of(new Unit());
    }
}
