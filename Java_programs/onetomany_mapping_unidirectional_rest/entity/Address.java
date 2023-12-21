package com.example.demoRestAPI.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jdk.jfr.Category;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name="address_info")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int  id;
    private String city;
    private String state;
    @JsonBackReference
    @OneToOne(mappedBy = "address",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    private Student student;

    public Address() {
    }


    public Address(int id, String city, String state, Student student) {
        this.id = id;
        this.city = city;
        this.state = state;
        this.student = student;
    }

    public Address(String city, String state) {

        this.city = city;
        this.state = state;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
