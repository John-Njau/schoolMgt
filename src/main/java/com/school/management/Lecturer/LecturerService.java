package com.school.management.Lecturer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LecturerService {

    private final LecturerRepository lecturerRepository;

    public LecturerService(LecturerRepository lecturerRepository) {
        this.lecturerRepository = lecturerRepository;
    }

//    get lecturers
    public List<Lecturer> getLecturers() {
        return lecturerRepository.findAll();
    }

//    add a new lecturer
    public Lecturer addLecturer(Lecturer lecturer) {
        return lecturerRepository.save(lecturer);
    }
}
