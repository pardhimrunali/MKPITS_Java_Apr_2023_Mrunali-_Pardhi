package com.example.demoRestAPI.service;

import com.example.demoRestAPI.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {
    Student saveData(Student student);

    List<Student> showAllData();

    Student UpdateRecord(Student student);

    Student getRollNo(Integer roll_no);
     void deleteStudent(Integer roll_no);
    Page<Student> getRecord(Pageable pageable);







}
