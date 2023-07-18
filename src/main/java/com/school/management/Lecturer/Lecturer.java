package com.school.management.Lecturer;

//import com.school.management.Student.Student;

import com.school.management.Unit.Unit;
import jakarta.persistence.*;

@Entity
@Table
public class Lecturer {

    @Id
    @SequenceGenerator(name = "lecturer_sequence", sequenceName = "lecturer_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lecturer_sequence")
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String profileImage;
    @ManyToOne
    @JoinColumn(name = "unit_id", referencedColumnName = "id", nullable = false)
    private Unit unit;

    public Lecturer() {
    }

    public Lecturer(Long id, String name, String email, Unit unit, String phoneNumber, String profileImage) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.unit = unit;
        this.phoneNumber = phoneNumber;
        this.profileImage = profileImage;
    }

    public Lecturer(String name, String email, Unit unit, String phoneNumber, String profileImage) {
        this.name = name;
        this.email = email;
        this.unit = unit;
        this.phoneNumber = phoneNumber;
        this.profileImage = profileImage;
    }

//    Setters are used to set the data on the endpoint JSON
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubject(Unit unit) {
        this.unit = unit;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

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

    public Unit getSubject() {
        return unit;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getProfileImage() {
        return profileImage;
    }
}
