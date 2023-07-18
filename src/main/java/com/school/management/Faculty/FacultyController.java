package com.school.management.Faculty;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculties")
public class FacultyController {

    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }


    @GetMapping(" ")
    List<Faculty> allFaculties() {
        return facultyService.getFaculties();
    }

    @PostMapping("/add")
    Faculty addFaculty(@RequestBody Faculty faculty) {
        return facultyService.addFaculty(faculty);
    }

}
