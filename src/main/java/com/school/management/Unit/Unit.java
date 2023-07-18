package com.school.management.Unit;

import com.school.management.Course.Course;
import com.school.management.Lecturer.Lecturer;
import com.school.management.Student.Student;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Unit {
    @Id
    @SequenceGenerator(name = "unit_sequence", sequenceName = "unit_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subject_sequence")
    private Long id;
    private String name;
    private String description;
    private Integer yearOfStudy;
    private String unitCode;
    @OneToOne
    @JoinColumn(name = "lecturer_id", referencedColumnName = "id")
    private Lecturer lecturer;
    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id", nullable = false)
    private Course course;
    @ManyToMany(mappedBy = "units", cascade = CascadeType.ALL)
    private List<Student> students;

    //        default constructor
    public Unit() {
    }

    //    constructor with all fields
    public Unit(Long id, String name, String description, Integer yearOfStudy, Lecturer lecturer, Course course, List<Student> students, String unitCode) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.yearOfStudy = yearOfStudy;
        this.lecturer = lecturer;
        this.course = course;
        this.students = students;
        this.unitCode = unitCode;
    }

    //    constructor without id
    public Unit(String name, String description, Integer yearOfStudy, Lecturer lecturer, Course course, List<Student> students, String unitCode) {
        this.name = name;
        this.description = description;
        this.yearOfStudy = yearOfStudy;
        this.lecturer = lecturer;
        this.course = course;
        this.students = students;
        this.unitCode = unitCode;
    }


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

    public Lecturer getLecturer() {
        return lecturer;
    }

    public Integer getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(Integer yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }
}
