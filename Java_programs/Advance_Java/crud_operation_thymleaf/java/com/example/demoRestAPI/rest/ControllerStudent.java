package com.example.demoRestAPI.rest;


import com.example.demoRestAPI.entity.Student;
import com.example.demoRestAPI.service.StudentImp;
import jakarta.servlet.http.HttpServletMapping;
import jakarta.servlet.http.HttpServletRequest;
import org.hibernate.annotations.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.util.List;

@Controller

public class ControllerStudent {

    private StudentImp studentImp;
@Autowired
    public ControllerStudent(StudentImp studentImp) {
        this.studentImp = studentImp;
    }


    @GetMapping("/register")
    public String registerUser(Model model)
    {
        Student student=new Student();
        model.addAttribute("stud",student);
        return "registration";
    }



    @PostMapping("/savedata")
            public String saveRecord(@ModelAttribute("stud") Student thestu){
    studentImp.saveData(thestu);
        return "redirect:/homepage";

    }

    @GetMapping("/homepage")
    public String show(Model model){
        List<Student> studentList=studentImp.showAllData();
        model.addAttribute("show",studentList);
        return "displayalldata";
    }

}
