package com.example.demoJPA;

import com.example.demoJPA.dao.StudentDao;
import com.example.demoJPA.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


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
	//	createStudent(studentDao);
	//recordFind(studentDao);
//allRecord(studentDao);
			//deleteData(studentDao);

			updateRecorcd(studentDao);



		};

	}

	public void createStudent(StudentDao studentDao){
		Student student=new Student("shyam","latur");
       studentDao.save(student);
	}

	public void recordFind(StudentDao studentDao)
	{
		Student student=studentDao.findRecord(2);
		System.out.println(student);
	}

public void allRecord(StudentDao studentDao)
{
	List<Student> studentList=studentDao.findAll();
	for (Student thestudent:studentList
		 ) {
		System.out.println(thestudent);
	}
}


public void deleteData(StudentDao studentDao)
{
	studentDao.deleteRecord(1);
}


public void updateRecorcd(StudentDao studentDao){
		Student student=studentDao.findRecord(3);
		student.setCity("Bhopal");
		student.setName("Ashwini");
		studentDao.updateData(student);
	     System.out.println("record updated");
}

}
