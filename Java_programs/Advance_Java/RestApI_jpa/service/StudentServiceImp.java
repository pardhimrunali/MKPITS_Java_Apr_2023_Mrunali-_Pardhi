package com.example.demoRestAPI.service;

import com.example.demoRestAPI.dao.StudentDao;
import com.example.demoRestAPI.dao.StudentDaoImp;
import com.example.demoRestAPI.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional
    public Student saveData(Student student) {
        return studentDao.save(student);
    }

    @Override
    @Transactional
    public String deleteRecord(Integer roll_no) {
        studentDao.delete(roll_no);
        return  "record delete successful";
    }

    @Override
    @Transactional
    public void insertRecord(Student student) {
        studentDao.insertData(student);


    }


}
