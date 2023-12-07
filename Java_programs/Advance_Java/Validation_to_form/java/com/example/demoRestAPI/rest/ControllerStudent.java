package com.example.demoRestAPI.rest;


import com.example.demoRestAPI.entity.Student;
import jakarta.servlet.http.HttpServletMapping;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.hibernate.annotations.Comments;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

@Controller

public class ControllerStudent {
    @GetMapping("/hello")
    public String homePage(Model model){
        model.addAttribute("name","Welcome Mrunali");

        return "homepage";
    }
    @GetMapping("/register")
    public String registerUser(Model model)
    {
        Student student=new Student();
        model.addAttribute("stud",student);
        return "registration";
    }

@PostMapping("/display")

    public String dataAdd(@Valid @ModelAttribute ("stud") Student thestudent, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
        return "registration";

    } else {
        return "showdata";
    }

}

}
