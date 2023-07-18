package com.school.management.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

//    get a list of departments
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

//    add a new department
    public Department addDepartment(Department department){
        return departmentRepository.save(department);
    }
}
