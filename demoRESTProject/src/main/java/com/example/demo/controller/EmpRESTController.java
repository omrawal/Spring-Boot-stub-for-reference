package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.EmpDao;
import com.example.demo.model.Employee;


// *** while creating project rest repository is not selected ***

@RestController
public class EmpRESTController {
	
	@Autowired
	EmpDao dao;
	
	@GetMapping(path = "/employees",produces = {"application/xml"}) // get response in XML dependency-> Jackson data format
	public List<Employee> getEmployees(){
		return dao.findAll();
	}
	@GetMapping("/employee/{sid}")
	public Optional<Employee> getEmployeeById(@PathVariable("sid") int sid){
		return dao.findById(sid);
	}
	
	@PostMapping("/employee")  // consumes also works the same way as produces
	public String insertEmployee(@RequestBody Employee emp) { //@RequestParam("name_of_passed_variable")
		System.out.println(emp);
		if(dao.existsById(emp.getEid())){
			return "Employee already exist for eid="+emp.getEid(); 
		}
		else {
			dao.save(emp);
			return "Employee successfully inserted";
		}
		
	}
}
