package com.infy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.infy.Entity.Student;
import com.infy.Repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	
	@Autowired
	private StudentRepository studentRepository;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		 
		
		Student Student1= new Student("john", "cena","johncena@gmail.com");
		studentRepository.save(Student1);
		
		
		Student Student2= new Student("Mark", "tyson","marktyson@gmail.com");
		studentRepository.save(Student2);
		
		Student Student3= new Student("Donald", "Trump","DonaldTrump@gmail.com");
		studentRepository.save(Student3);
	
	
	}

}
