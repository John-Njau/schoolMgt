package com.school.management.Lecturer;

import com.school.management.Course.Course;
import com.school.management.Course.CourseRepository;
import com.school.management.Department.Department;
import com.school.management.Department.DepartmentRepository;
import com.school.management.Faculty.Faculty;
import com.school.management.Faculty.FacultyRepository;
import com.school.management.Unit.Unit;
import com.school.management.Unit.UnitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class LecturerConfig {

    CommandLineRunner lecturerCommandLineRunner(
            LecturerRepository lecturerRepository,
            UnitRepository unitRepository,
            CourseRepository courseRepository,
            DepartmentRepository departmentRepository,
            FacultyRepository facultyRepository
    ) {
        return args -> {
            Faculty agriculture = new Faculty(
                    1L,
                    "Agriculture"
            );

//            save the faculty
            facultyRepository.save(agriculture);

            Department agriEconomics = new Department(
                    1L,
                    "Agricultural Economics",
                    agriculture
            );

//            save the department
            departmentRepository.save(agriEconomics);

            Course BscAgriculture = new Course(
                    1L,
                    "Bachelor of Science Agriculture, Education and Extension",
                    "Agriculture is the science and art of cultivating plants and livestock.",
                    "A32",
                    agriEconomics
            );
            Course BscAgribiz = new Course(
                    2L,
                    "Bachelor of Science Agribusiness Management",
                    "Agribusiness is the business of agricultural production.",
                    "A31",
                    agriEconomics
            );

            courseRepository.saveAll(
                    List.of(BscAgriculture, BscAgribiz));

            Unit unit1 = new Unit(
                    1L,
                    "Intro to Bsc Agriculture",
                    "This unit introduces students to the basics of Bsc Agriculture",
                    2,
                    "ACBM01",
                    BscAgribiz,
                    null
                    );

            unitRepository.save(unit1);

//            units for a lecturer
//            List <Unit> units = List.of(unit1);
            List<Unit> unitsForLecturer = new ArrayList<>();
            unitsForLecturer.add(unit1);

            Lecturer lecturer1 = new Lecturer(
                    1L,
                    "Dr. John Doe",
                    "john@lec.com",
                    unitsForLecturer,
                    "0701911030",
                    ""
            );

            lecturerRepository.save(lecturer1);
        };
    }
}
