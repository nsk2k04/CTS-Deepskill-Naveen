package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    public Student() {} // ✅ Default constructor required by JPA

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
    // 🔽 ADD THESE GETTERS if missing
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // 🔽 ADD THESE SETTERS too if needed
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
