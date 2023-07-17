package com.school.management.Student;

import com.school.management.Subject.Subject;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired //dependency injection
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //get a list of all students
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    //    get a student by id
    public Student getStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if (!exists) {
            throw new IllegalStateException("Student with id " + studentId + " does not exist");
        }
        return studentRepository.findById(studentId).get();
    }

    //add a new student
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    //    Delete a student
    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if (!exists) {
            throw new IllegalStateException("Student with id " + studentId + " does not exist");
        }
        studentRepository.deleteById(studentId);
    }

    @Transactional
//    Update a student - PATCH
    public void updateStudent(Long studentId, Student student) {
        Student existingStudent = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException("Student with id " + studentId + " does not exist"));

        if (student.getName() != null) {
            existingStudent.setName(student.getName());
        }
        if (student.getEmail() != null) {
            existingStudent.setEmail(student.getEmail());
        }
        if (student.getPhoneNumber() != null) {
            existingStudent.setPhoneNumber(student.getPhoneNumber());
        }
        if (student.getYearOfStudy() != null) {
            existingStudent.setYearOfStudy(student.getYearOfStudy());
        }
        studentRepository.save(existingStudent);
    }

    @Transactional
    //    Update a student - PUT
    public void updateStudentDetails(Long studentId, Student student) {
        Student existingStudent = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException("Student with id " + studentId + " does not exist"));

            existingStudent.setName(student.getName());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setPhoneNumber(student.getPhoneNumber());
            existingStudent.setDob(student.getDob());
            existingStudent.setRegistrationNumber(student.getRegistrationNumber());
            existingStudent.setYearOfStudy(student.getYearOfStudy());
        studentRepository.save(existingStudent);
    }

//    TODO: Add a method to get a list of all subjects for a student - DONE
    public List<Subject> studentSubjects(Long studentId) {
        Student existingStudent = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException("Student with id " + studentId + " does not exist"));
        return existingStudent.getSubjects();
    }

}
