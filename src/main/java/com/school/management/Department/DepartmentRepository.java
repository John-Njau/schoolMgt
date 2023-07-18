package com.school.management.Department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Each repository is an interface extending the JpaRepository interface.
// The JpaRepository interface is a Spring Data interface providing CRUD functionality.
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findDepartmentByName(String name);

}
