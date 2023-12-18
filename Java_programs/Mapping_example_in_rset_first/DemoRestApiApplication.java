package com.example.demoRestAPI;

import com.example.demoRestAPI.entity.Address;
import com.example.demoRestAPI.entity.Student;
import com.example.demoRestAPI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoRestApiApplication   {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestApiApplication.class, args);
	}



}
