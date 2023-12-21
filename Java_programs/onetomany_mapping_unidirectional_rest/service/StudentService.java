package com.example.demoRestAPI.service;

import com.example.demoRestAPI.entity.Student;

import java.util.List;

public interface StudentService {
    String SaveStudent(Student student);
    List<Student> showAllStudent();
    Student FindData(Integer roll_no);

    void DeleteRecord(Integer roll_no);
}
