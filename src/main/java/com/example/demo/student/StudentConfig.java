package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
            );
            Student alex  = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2001, JANUARY, 5)
            );

            List<Student> students = new ArrayList<>();
            students.add(mariam);
            students.add(alex);

            repository.saveAll(
                    students
            );

        };
    }
}
