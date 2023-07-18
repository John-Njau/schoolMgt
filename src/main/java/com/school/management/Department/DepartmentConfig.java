package com.school.management.Department;

import com.school.management.Faculty.Faculty;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DepartmentConfig {

    @Bean
    CommandLineRunner departmentCommandLineRunner(
            DepartmentRepository repository) {
        return args -> {
            Faculty agriculture = new Faculty(
                    1L,
                    "Agriculture"
            );
            Faculty arts = new Faculty(
                    2L,
                    "Arts and Social Sciences"
            );
            Faculty scienceTechnology = new Faculty(
                    3L,
                    "Science and Technology"
            );
            Department agriEconomics = new Department(
                    1L,
                    "Agricultural Economics",
                    agriculture
            );
            Department foodScience = new Department(
                    2L,
                    "Food Science, Nutrition and Technology",
                    agriculture
            );
            Department landResource = new Department(
                    3L,
                    "Land Resource Management and Agricultural Technology",
                    agriculture
            );
            Department plantScience = new Department(
                    4L,
                    "Plant Science and Crop Production",
                    agriculture
            );

            repository.saveAll(
                    List.of(agriEconomics, foodScience, landResource, plantScience));
        };

    }
}
