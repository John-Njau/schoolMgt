package com.school.management.Lecturer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LecturerController {

    @GetMapping("/lecturers")
    public List<Lecturer> getLecturer() {
        return List.of(new Lecturer());
    }
}