package com.school.management.Student;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.school.management.Subject.Subject;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    @DateTimeFormat(pattern = "yyyy/M/d")
    @JsonFormat(pattern = "yyyy/M/d")
    private LocalDate dob;
    private String registrationNumber;
    private YearOfStudy yearOfStudy;
    private String phoneNumber;
    @Transient
    private Integer age;

    @ManyToMany
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private List<Subject> subjects = new ArrayList<>();

    public Student() { }

    public Student(Long id, String name, String email, LocalDate dob, String registrationNumber, YearOfStudy yearOfStudy, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.registrationNumber = registrationNumber;
        this.yearOfStudy = yearOfStudy;
        this.phoneNumber = phoneNumber;
    }

    public Student(String name, String email, LocalDate dob, String registrationNumber, YearOfStudy yearOfStudy, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.registrationNumber = registrationNumber;
        this.yearOfStudy = yearOfStudy;
        this.phoneNumber = phoneNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        if (dob !=null){
            return Period.between(this.dob, LocalDate.now()).getYears();
        } else {
            return null;
        }
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }


    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    public YearOfStudy getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(YearOfStudy yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
