package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Insert dummy data
        studentRepository.save(new Student("Naveen", "naveen@email.com"));
        studentRepository.save(new Student("nivi", "nivi@email.com"));

        // Custom query: find by name
        System.out.println("\nFinding student by name:");
        studentRepository.findByName("nivi").forEach(
                s -> System.out.println("Found: " + s.getId() + ", " + s.getName() + ", " + s.getEmail())
        );

        // Update email
        studentRepository.updateEmailByName("nivi@email.com", "nivi");
        System.out.println("\nAfter update:");
        studentRepository.findByName("nivi").forEach(
                s -> System.out.println("Updated: " + s.getId() + ", " + s.getName() + ", " + s.getEmail())
        );

        // Delete record
        studentRepository.deleteByName("Naveen");
        System.out.println("\nAfter deletion:");
        studentRepository.findAll().forEach(
                s -> System.out.println("Remaining: " + s.getId() + ", " + s.getName() + ", " + s.getEmail())
        );
    }
}
