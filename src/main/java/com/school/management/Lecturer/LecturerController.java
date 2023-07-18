package com.school.management.Lecturer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lecturers")
public class LecturerController {

    private final LecturerService lecturerService;

    public LecturerController(LecturerService lecturerService) {
        this.lecturerService = lecturerService;
    }

    @GetMapping(" ")
    List<Lecturer> getLecturer() {
        return lecturerService.getLecturers();
    }

    @PostMapping("/add")
    Lecturer addLecturer(@RequestBody Lecturer lecturer) {
        return lecturerService.addLecturer(lecturer);
    }
}