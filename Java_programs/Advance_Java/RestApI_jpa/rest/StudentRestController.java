package com.example.demoRestAPI.rest;

import com.example.demoRestAPI.entity.Student;
import com.example.demoRestAPI.service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/student")
    public List<Student> getData(){
        return  studentServiceImp.finadAll();
    }




    @GetMapping("/students/{roll_no}")
    public Student getdata(@PathVariable int roll_no){
      return studentServiceImp.finadAll().get(roll_no);
    }

    @PostMapping("/students")
    public Student getStudent( @RequestBody Student student){
        return studentServiceImp.saveData(student);
    }

    @DeleteMapping("/student/{roll_no}")
    public String deleteStudent(@PathVariable int roll_no)

    {
        studentServiceImp.deleteRecord(roll_no);
        return "Successfully delete";


    }

    @PutMapping("/student")
    public String insertData(@RequestBody  Student student)
    {
        studentServiceImp.insertRecord(student);
        return "Data inserted ";
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
