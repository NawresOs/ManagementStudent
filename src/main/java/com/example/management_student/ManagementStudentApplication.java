package com.example.management_student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManagementStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagementStudentApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
    ) {
        return  args -> {
            System.out.println("Container started");
        };
    }
}
