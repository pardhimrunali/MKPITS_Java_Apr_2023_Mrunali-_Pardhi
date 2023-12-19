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
public class DemoRestApiApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestApiApplication.class, args);
	}

	private StudentService studentService;
	@Autowired

	public DemoRestApiApplication(StudentService studentService) {
		this.studentService = studentService;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hiii");
		save();
	}
	public String save(){
		Address address=new Address("pune","mp");
		Student stud=new Student(150,"trupti",address);
		studentService.SaveStudent(stud);
		return "data inserted";

	}

}
