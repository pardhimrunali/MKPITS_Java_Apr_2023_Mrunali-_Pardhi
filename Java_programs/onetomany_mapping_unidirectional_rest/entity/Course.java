package com.example.demoRestAPI.entity;

import jakarta.persistence.*;

@Entity
@Table(name="course_info")

public class Course {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String course_name;

    public Course() {
    }

    public Course(String course_name) {
        this.course_name = course_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", course_name='" + course_name + '\'' +
                '}';
    }
}
