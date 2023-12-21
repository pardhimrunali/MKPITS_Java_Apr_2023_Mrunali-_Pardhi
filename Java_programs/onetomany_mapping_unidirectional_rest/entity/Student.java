package com.example.demoRestAPI.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="student_info")
public class Student {
    @Id
    private int roll_no;
    private String name;
    @JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "address_info_id")
    private Address address;
    @OneToMany(cascade =CascadeType.ALL)
    @JoinColumn(name = "course_info_id")
    private List<Course> course;

    public Student(List<Course> course) {
        this.course = course;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    public Student(Address address1) {


    }



    public Student(int roll_no, String name, Address address) {
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
    }

    public Student() {

    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
