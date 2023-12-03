package com.example.demoRestAPI.service;

import com.example.demoRestAPI.dao.RepsitoryJpaExample;
import com.example.demoRestAPI.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService{


    private RepsitoryJpaExample repsitoryJpaExample;

    @Autowired

    public StudentServiceImp(RepsitoryJpaExample repsitoryJpaExample) {
        this.repsitoryJpaExample = repsitoryJpaExample;
    }







    @Override
    public List<Student> finadAll() {
        return repsitoryJpaExample.findAll();
    }

    @Override
    @Transactional
    public Student saveData(Student student) {
        return repsitoryJpaExample.save(student);
    }

    @Override
    @Transactional
    public String deleteRecord(Integer roll_no) {
        repsitoryJpaExample.deleteById(roll_no);
        return  "record deleted successfuly";
    }

    @Override
    @Transactional
    public Student FindRecord(Integer roll_no) {
      Optional<Student> student =repsitoryJpaExample.findById(roll_no);
     return  student.get();
    }

    @Override
    public Student Update(Integer roll_no) {
        return null;
    }


}
