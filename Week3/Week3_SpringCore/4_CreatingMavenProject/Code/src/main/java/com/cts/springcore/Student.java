package com.cts.springcore;


public class Student {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}