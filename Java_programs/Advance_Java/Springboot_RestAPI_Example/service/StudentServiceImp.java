package com.example.demoRestAPI.service;

import com.example.demoRestAPI.dao.StudentDao;
import com.example.demoRestAPI.dao.StudentDaoImp;
import com.example.demoRestAPI.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImp implements StudentService{


    private StudentDaoImp studentDao;
    @Autowired

    public StudentServiceImp(StudentDaoImp studentDao) {
        this.studentDao = studentDao;
    }





    @Override
    public List<Student> finadAll() {
        return studentDao.findAllRecord();
    }
}
