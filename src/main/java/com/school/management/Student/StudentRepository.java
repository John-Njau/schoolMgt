package com.school.management.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


// Enables CRUD operations
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//    connects to database and gets all students instead of writing SQL queries
//    transforms to SQL: SELECT * FROM student WHERE email = ?

    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
