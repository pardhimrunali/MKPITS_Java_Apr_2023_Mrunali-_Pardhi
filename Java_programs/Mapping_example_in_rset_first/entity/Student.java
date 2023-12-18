package com.example.demoRestAPI.entity;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

@Entity
@Table(name="student_info")
public class Student {
    @Id
    private int roll_no;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "address_info_id")
    private Address address;

    public Student() {

    }

    public Student(int roll_no, String name, Address address) {
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
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
