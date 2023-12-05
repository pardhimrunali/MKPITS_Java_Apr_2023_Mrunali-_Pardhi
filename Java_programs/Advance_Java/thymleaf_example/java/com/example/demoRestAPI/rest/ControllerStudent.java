package com.example.demoRestAPI.rest;


import jakarta.servlet.http.HttpServletMapping;
import jakarta.servlet.http.HttpServletRequest;
import org.hibernate.annotations.Comments;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String registerUser()
    {
        return "registration";
    }

    @GetMapping("/showdata")
    public String dataadd(HttpServletRequest request, Model model){
        int roll_no= Integer.parseInt(request.getParameter("rollnumber"));
        String name=request.getParameter("studentname");
        String city=request.getParameter("city");


        model.addAttribute("roll",roll_no);
        model.addAttribute("name",name);
        model.addAttribute("city",city);
        return  "showdata";

    }
}
