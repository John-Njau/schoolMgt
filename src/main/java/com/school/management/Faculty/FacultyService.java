package com.school.management.Faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class FacultyService {

    private final FacultyRepository facultyRepository;

    @Autowired
    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

//    get a list of faculties
    public List<Faculty> getFaculties() {
        return facultyRepository.findAll();
    }

//    add a new faculty
    public Faculty addFaculty(Faculty faculty){
        return facultyRepository.save(faculty);
    }

}
