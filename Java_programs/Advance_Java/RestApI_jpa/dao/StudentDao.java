package com.example.demoRestAPI.dao;

import com.example.demoRestAPI.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAllRecord();

Student save(Student student);

 String delete(Integer roll_no);

 void insertData(Student student);



}
