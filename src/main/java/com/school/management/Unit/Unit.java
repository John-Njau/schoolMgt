package com.school.management.Unit;

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
    @OneToOne
    @JoinColumn(name = "lecturer_id", referencedColumnName = "id")
    private Lecturer lecturer;
    @ManyToMany(mappedBy = "units", cascade = CascadeType.ALL)
    private List<Student> students;

    public Unit() {
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

}