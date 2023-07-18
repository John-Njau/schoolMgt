package com.school.management.Course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Course {
    @Id
    private Long id;
    private String name;

}
