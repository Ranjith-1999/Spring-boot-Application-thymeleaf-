package com.infy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.Entity.Student;



public interface StudentRepository extends JpaRepository<Student,Long>{

	
	
}
