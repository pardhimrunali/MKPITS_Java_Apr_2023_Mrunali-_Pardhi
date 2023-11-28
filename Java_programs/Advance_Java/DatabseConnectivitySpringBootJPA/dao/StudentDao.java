package com.example.demoJPA.dao;

import com.example.demoJPA.entity.Student;

public interface StudentDao {
    void save(Student student);
    Student find(Integer roll_no);


}
