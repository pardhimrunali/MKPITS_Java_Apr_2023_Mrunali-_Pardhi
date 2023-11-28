package com.example.demoJPA;

import com.example.demoJPA.dao.StudentDao;
import com.example.demoJPA.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJpaApplication.class, args);
		System.out.println("hello");

	}
@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner->{
//			System.out.println("hii");
//			createStudent(studentDao);
			recordFind(studentDao);

		};

	}

	public void createStudent(StudentDao studentDao){
		Student student=new Student("radha","nagpur");
       studentDao.save(student);
	}

	public void recordFind(StudentDao studentDao)
	{
		Student student=studentDao.find(1);
		System.out.println(student);
	}



}
