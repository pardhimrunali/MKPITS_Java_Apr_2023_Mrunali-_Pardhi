package com.example.demoRestAPI.rest;

import com.example.demoRestAPI.entity.Student;
import com.example.demoRestAPI.exceptionstudent.ErrorPage;
import com.example.demoRestAPI.exceptionstudent.RecordNotFoundException;
import com.example.demoRestAPI.service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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


    @GetMapping("/students")
    public List<Student> getData(){
        return  studentServiceImp.finadAll();

    }

    @PostMapping("/students")
    public String getStudent(@RequestBody  Student student){
        studentServiceImp.saveData(student);
        return "data Inserted";
    }

@DeleteMapping("/students/{roll_no}")
    public String delete( @PathVariable Integer roll_no){
        studentServiceImp.deleteRecord(roll_no);
    return  "record deleted successfully";
}


@GetMapping("/students/{roll_no}")
    public Student FindRecord(@PathVariable Integer roll_no )
{
    return studentServiceImp.FindRecord(roll_no);
}

@PutMapping("/students")
    public String Update(@RequestBody Student student)
{
   return studentServiceImp.Update(student);
}





}
