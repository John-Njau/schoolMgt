package com.school.management.Course;

import com.school.management.Department.Department;
import jakarta.persistence.*;

@Entity
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @Column(unique = true)
    private String code;
    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id", nullable = false)
    private Department department;

//    default constructor
    public Course() {
    }

//    constructor with all fields
    public Course(Long id, String name, String description, String code, Department department) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.code = code;
        this.department = department;
    }

//    constructor without id
    public Course(String name, String description, String code, Department department) {
        this.name = name;
        this.description = description;
        this.code = code;
        this.department = department;
    }

//    getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
