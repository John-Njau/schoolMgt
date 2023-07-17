package com.school.management.Lecturer;

//import com.school.management.Student.Student;

import com.school.management.Subject.Subject;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table
public class Lecturer {

    @Id
    @SequenceGenerator(name = "lecturer_sequence", sequenceName = "lecturer_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lecturer_sequence")
    private Long id;
    private String name;
    private String email;

    @OneToOne(mappedBy = "lecturer", cascade = CascadeType.ALL, orphanRemoval = true)
    private Subject subject;

    public Lecturer() {
    }

    public Lecturer(Long id, String name, String email, Subject subject) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.subject = subject;
    }

    public Lecturer(String name, String email, Subject subject) {
        this.name = name;
        this.email = email;
        this.subject = subject;
    }

//    Setters
//    setters are used to set the data on the endpoint JSON
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

//    Getters
//    getters show the data being returned on the endpoint JSON
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public Subject getSubject() {
        return subject;
    }
}
