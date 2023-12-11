package com.example.demoRestAPI.dao;

import com.example.demoRestAPI.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepsitoryJpaExample extends JpaRepository<Student,Integer> {
}
