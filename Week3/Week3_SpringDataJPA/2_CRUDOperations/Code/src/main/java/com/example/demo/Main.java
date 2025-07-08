package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        studentRepository.save(new Student("Naveen", "naveen@email.com"));
        studentRepository.save(new Student("Nivi", "Nivii@email.com"));

        System.out.println("\nAll Students:");
        studentRepository.findAll().forEach(s ->
                System.out.println(s.getId() + " " + s.getName() + " " + s.getEmail())
        );

        studentRepository.deleteById(1L);
        System.out.println("\nAfter Deletion:");
        studentRepository.findAll().forEach(s ->
                System.out.println(s.getId() + " " + s.getName() + " " + s.getEmail())
        );
    }
}
