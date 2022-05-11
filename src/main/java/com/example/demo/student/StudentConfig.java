package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.tools.jar.CommandLine;

import java.sql.Array;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Ma",
                    "Magmail",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            Student mariam2 = new Student(
                    2L,
                    "Ma1a",
                    "Mag1mail",
                    LocalDate.of(2100, Month.JANUARY, 5)
            );

            List<Student> studentList= new ArrayList<>();
            studentList.add(mariam);
            studentList.add(mariam2);
            studentRepository.saveAll(studentList);
        };
    }
}
