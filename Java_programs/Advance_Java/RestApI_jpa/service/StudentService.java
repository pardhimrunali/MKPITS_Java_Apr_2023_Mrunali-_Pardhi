package com.example.demoRestAPI.service;

import com.example.demoRestAPI.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> finadAll();

    Student saveData(Student student);

    String deleteRecord(Integer roll_no);

    void insertRecord(Student student);

}
