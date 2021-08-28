package com.example.springBoot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

//@Configuration
public class StudentConfig {

    /*

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
          Students murielle = new Students(
                  null,
                  "Murielle",
                  "murielle@rdi.com",
                  LocalDate.of(1994, Month.NOVEMBER, 26)
          );

            Students kephren = new Students(
                    null,
                    "kephren",
                    "kephren@rdi.com",
                    LocalDate.of(2021, Month.FEBRUARY, 18)
            );

            Students priscillia = new Students(
                    null,
                    "priscillia",
                    "priscillia@rdi.com",
                    LocalDate.of(2011, Month.JULY, 26)
            );

            Students jenny = new Students(
                    null,
                    "jenny",
                    "jenny@rdi.com",
                    LocalDate.of(2003, Month.JUNE, 30)
            );

             studentRepository.saveAll(
                     Arrays.asList(murielle, kephren, jenny, priscillia)
             );

        };
    }*/


}
