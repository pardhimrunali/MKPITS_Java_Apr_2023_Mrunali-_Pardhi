package com.example.demoRestAPI.dao;

import com.example.demoRestAPI.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAllRecord();
}
