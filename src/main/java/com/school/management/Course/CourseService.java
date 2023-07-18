package com.school.management.Course;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

//    get a list of courses
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

//    add a new course
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }
}
