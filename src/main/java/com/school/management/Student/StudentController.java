package com.school.management.Student;

import com.school.management.Unit.Unit;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    ResponseEntity<List<Student>> getStudents() {
        return new ResponseEntity<>(studentService.getStudents(), HttpStatus.OK);
    }

    //    Get single student by ID
    @GetMapping("/students/{studentId}")
    ResponseEntity<Student> getStudentById(@PathVariable Long studentId) {
        return new ResponseEntity<>(studentService.getStudent(studentId), HttpStatus.OK);
    }

    @PostMapping("/students")
    ResponseEntity<Student> addStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.CREATED);
    }

    //    Delete a student
    @DeleteMapping("/students/delete/{studentId}")
    ResponseEntity<?> deleteStudent(@PathVariable Long studentId) {
        studentService.deleteStudent(studentId);
        return new ResponseEntity<>("Student with id " + studentId + " has been deleted", HttpStatus.OK);
    }

    //    update a student
    @PatchMapping("/students/update/{studentId}")
    ResponseEntity<Student> updateStudent(@PathVariable Long studentId, @RequestBody Student student) {
        studentService.updateStudent(studentId, student);
        student.setId(studentId); // Set the ID in the updated student object
        return ResponseEntity.ok().body(student);
    }

    //    update all student details - PUT
    @PutMapping("/students/update/{studentId}")
    ResponseEntity<?> updateStudentDetails(@PathVariable Long studentId, @RequestBody Student student) {
        studentService.updateStudentDetails(studentId, student);
        student.setId(studentId); // Set the ID in the updated student object
        return ResponseEntity.ok().body(student);
    }

    //    Get a list of all subjects for a student
    @GetMapping("/students/{studentId}/subjects")
    ResponseEntity<List<Unit>> getStudentSubjects(@PathVariable Long studentId) {
        return new ResponseEntity<>(studentService.studentSubjects(studentId), HttpStatus.OK);
    }
}
