package com.sandhya.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sandhya.springboot.model.Employee;

//Jpa Repository exposes database CRUD methods like save, findById, findAll, deleteById, delete etc.
//Jpa Repository provides out of the box implementations for all the database methods, so no need to write any 
//boiler plate code to develop DAO layer.

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
}
