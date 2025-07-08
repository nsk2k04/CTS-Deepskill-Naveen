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
        Student s1 = new Student();
        s1.setName("Naveen");
        s1.setEmail("nski@email.com");

        studentRepository.save(s1);

        studentRepository.findAll().forEach(s ->
                System.out.println("Student: " + s.getId() + ", " + s.getName() + ", " + s.getEmail()));
    }
}
