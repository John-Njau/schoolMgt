package com.school.management.Faculty;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class FacultyConfig {

    @Bean
    CommandLineRunner facultyCommandLineRunner(
            FacultyRepository repository) {
        return args -> {
            Faculty agriculture = new Faculty(
                    1L,
                    "Agriculture");
            Faculty arts = new Faculty(
                    2L,
                    "Arts and Social Sciences"
            );
            Faculty scienceTechnology = new Faculty(
                    3L,
                    "Science and Technology"
            );
            repository.saveAll(
                    List.of(agriculture, arts, scienceTechnology));
        };
    }
}
