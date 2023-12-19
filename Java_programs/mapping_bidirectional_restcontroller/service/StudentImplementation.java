package com.example.demoRestAPI.service;

import com.example.demoRestAPI.dao.RepsitoryJpaExample;
import com.example.demoRestAPI.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class StudentImplementation implements StudentService{
    private RepsitoryJpaExample repsitoryJpaExample;
    @Autowired

    public StudentImplementation(RepsitoryJpaExample repsitoryJpaExample) {
        this.repsitoryJpaExample = repsitoryJpaExample;
    }

    @Override
    @Transactional
    public String SaveStudent(Student student) {
        repsitoryJpaExample.save(student);
        return "data inserted";
    }
}
