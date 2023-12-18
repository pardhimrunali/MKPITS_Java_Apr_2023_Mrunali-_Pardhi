package com.example.demoRestAPI.Controller;

import com.example.demoRestAPI.entity.Student;
import com.example.demoRestAPI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    private StudentService studentService;
@Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public String saveData( @RequestBody Student student){
    studentService.SaveStudent(student);
    return "data inserted";
    }
    @GetMapping("/students/{roll_no}")
public Student showdata(@PathVariable int roll_no){
    return studentService.FindData(roll_no);
    }

    @DeleteMapping("/students/{roll_no}")
    public String deleteData(@PathVariable int roll_no)
    {
         studentService.DeleteRecord(roll_no);
        return "Record deleted Successfully";
    }

}
