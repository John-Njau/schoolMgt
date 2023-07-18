package com.school.management.Course;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping(" ")
    List<Course> allCourses() {
        return courseService.getCourses();
    }

    @PostMapping("/add")
    Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

}
