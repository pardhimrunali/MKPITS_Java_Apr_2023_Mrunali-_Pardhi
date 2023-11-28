package com.example.demoJPA.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
    @Id


    private int roll_no;

    private String name;


    private String city;

    public Student() {
    }

    public Student( String name, String city) {

        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
