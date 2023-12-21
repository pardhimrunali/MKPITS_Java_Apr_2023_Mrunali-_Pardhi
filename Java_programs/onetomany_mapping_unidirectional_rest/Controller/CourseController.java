package com.example.demoRestAPI.Controller;

import com.example.demoRestAPI.entity.Address;
import com.example.demoRestAPI.entity.Course;
import com.example.demoRestAPI.entity.Student;
import com.example.demoRestAPI.service.CourseService;
import com.example.demoRestAPI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {
    private StudentService studentService;
    private CourseService courseService;
    @Autowired
    public CourseController(StudentService studentService, CourseService courseService) {
        this.studentService = studentService;
        this.courseService = courseService;
    }




    @PostMapping("/courses")
    public String insertRecord(){
        Address address=new Address("pune","MH");
        Student student=new Student(101,"pri",address);
        List<Course> courses=new ArrayList<>();
        Course course1=new Course("java");
        Course course2=new Course("ruby");
        courses.add(course2);
        courses.add(course1);
        student.setCourse(courses);
        studentService.SaveStudent(student);
        return "data inserted";
    }
}
