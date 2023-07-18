package com.school.management.Department;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @RequestMapping(" ")
    List<Department> getDepartments() {
        return departmentService.getDepartments();
    }

    @PostMapping("/add")
    Department addDepartment(@RequestBody Department department) {
        return departmentService.addDepartment(department);
    }
}
