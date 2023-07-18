package com.school.management.Course;

import com.school.management.Department.Department;
import com.school.management.Department.DepartmentRepository;
import com.school.management.Faculty.Faculty;
import com.school.management.Faculty.FacultyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CourseConfig {

    @Bean
    CommandLineRunner courseCommandLineRunner(
            CourseRepository courseRepository,
            FacultyRepository facultyRepository,
            DepartmentRepository departmentRepository
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
        };
    }

}
