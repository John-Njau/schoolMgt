package com.school.management.Student;

        import org.springframework.boot.CommandLineRunner;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;

        import java.time.LocalDate;
        import java.time.Month;
        import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner studentCommandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Mariam",
                    "john.g@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "XR456/2022",
                    YearOfStudy.Fifth,
                    "089765432"


            );
            Student alex = new Student(
                    2L,
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5),
                    "XR456/2022",
                    YearOfStudy.Fifth,
                    "089765432"
            );
            Student anna = new Student(
                    3L,
                    "Anna",
                    "anna@banda.com",
                    LocalDate.of(2002, Month.JANUARY, 5),
                    "XR456/2022",
                    YearOfStudy.Fifth,
                    "089765432"

            );
            Student njoki = new Student(
                    4L,
                    "Njoki",
                    "njoki@dead.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "XR456/2022",
                    YearOfStudy.Fifth,
                    "089765432"

            );
            Student john = new Student(
                    5L,
                    "John",
                    "john@mail.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "XR456/2022",
                    YearOfStudy.Fifth,
                    "089765432"

            );
            Student jane = new Student(
                    6L,
                    "Jane",
                    "jane@kmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "XR456/2022",
                    YearOfStudy.Fifth,
                    "089765432"

            );
            Student linda = new Student(
                    7L,
                    "Linda Karibabes",
                    "Linda@uon.com",
                    LocalDate.of(2001, Month.JUNE, 12),
                    "XR456/2022",
                    YearOfStudy.Fifth,
                    "089765432"
            );
            repository.saveAll(
                    List.of(mariam, alex, anna, njoki, john, jane, linda));

        };
    }
}
