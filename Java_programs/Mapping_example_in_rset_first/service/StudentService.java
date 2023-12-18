package com.example.demoRestAPI.service;

import com.example.demoRestAPI.entity.Student;

public interface StudentService {
    String SaveStudent(Student student);


    Student FindData(Integer roll_no);

    void DeleteRecord(Integer roll_no);
}
