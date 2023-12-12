package com.example.demoJPA.dao;

import com.example.demoJPA.entity.Student;

import java.util.List;

public interface StudentDao {
    void save(Student student);
    Student findRecord(Integer roll_no);
    List<Student> findAll();

    void deleteRecord(Integer roll_no);

Student updateData(Student student);


}
