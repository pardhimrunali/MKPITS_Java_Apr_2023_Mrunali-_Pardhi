package com.example.demoRestAPI.rest;

import com.example.demoRestAPI.entity.Student;
import com.example.demoRestAPI.service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {


    private StudentServiceImp studentServiceImp;
    @Autowired

    public StudentRestController(StudentServiceImp studentServiceImp) {
        this.studentServiceImp = studentServiceImp;
    }
    @GetMapping("/data")
    public List<Student> getData(){
        return  studentServiceImp.finadAll();
    }
    @GetMapping("/s/{roll_no}")
    public Student getdata(@PathVariable int roll_no){
      return studentServiceImp.finadAll().get(roll_no);


    }
    //
//
//    @GetMapping("/studentDetail")
//    public List<Student> getDetails(){
//        List<Student> studentlist=new ArrayList<>();
//        studentlist.add(new Student(101,"ram","pune","Maharashtra"));
//        studentlist.add(new Student(102,"radha","nagpur","Maharashtra"));
//        return  studentlist;
//    }
//    @GetMapping("/studentspecific/{studentId}")
//    public Student getUserDetails(@PathVariable int studentId) {
//
//            List<Student> studentlist=new ArrayList<>();
//        studentlist.add(new Student(101,"ram","pune","Maharashtra"));
//        studentlist.add(new Student(102,"radha","nagpur","Maharashtra"));
//
//         return studentlist.get(studentId);
//    }
}
