package com.example.demoRestAPI.service;

import com.example.demoRestAPI.dao.RepsitoryJpaExample;
import com.example.demoRestAPI.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class StudentImp implements StudentService{
    private RepsitoryJpaExample repsitoryJpaExample;
@Autowired
    public StudentImp(RepsitoryJpaExample repsitoryJpaExample) {
        this.repsitoryJpaExample = repsitoryJpaExample;
    }

    @Override
    @Transactional
    public Student saveData(@ModelAttribute("stud") Student student) {
        return repsitoryJpaExample.save(student);
    }

    @Override
    @Transactional
    public List<Student> showAllData() {
        return repsitoryJpaExample.findAll();
    }






}



