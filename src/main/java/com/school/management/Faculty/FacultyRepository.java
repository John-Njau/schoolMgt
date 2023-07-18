package com.school.management.Faculty;

import com.school.management.Student.StudentRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Each repository is an interface extending the JpaRepository interface.
// The JpaRepository interface is a Spring Data interface providing CRUD functionality.
@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    Faculty findFacultyByName(String name);
}
