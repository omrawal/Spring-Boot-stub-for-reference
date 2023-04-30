package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmpDao;

@Controller
public class EmpController {
	
	@Autowired
	EmpDao dao;
	
	@RequestMapping("/")
	public String empManagement() {
		return "index.jsp";
	}
	
	@RequestMapping("/addEmp")
	public String addEmployee(Employee emp) {
		if(dao.existsById(emp.getEid())) {
			System.out.println("Employee id Already exist for id: "+emp.getEid());
		}
		else {
			dao.save(emp);
			System.out.println(emp);
		}
		
		return "index.jsp";
	}
	
	@RequestMapping("/findEmp")
	@ResponseBody
	public String findEmployee(int eid ) {
		if(dao.existsById(eid)) {
			Employee emp=dao.findById(eid).orElse(new Employee());
			System.out.println(emp);
			return "Found employee is ->"+emp.toString();
		}
		else {
			
			return "Employee Not Found with employee id: "+eid;
		}
		
	}
	
	@RequestMapping("/updateEmp")
	public String updateEmployee(Employee emp) {
		if(dao.existsById(emp.getEid())) {
			dao.save(emp);
			System.out.println(emp);
		}
		else {
			System.out.println("Employee id does not exist for id: "+emp.getEid());
		}
		
		return "index.jsp"; 
	}
	
	@RequestMapping("/deleteEmp")
	public String deleteEmployee(int eid) {
		if(dao.existsById(eid)) {
			dao.deleteById(eid);
			System.out.println("Employee with id "+eid+" deleted");
		}
		else {
			System.out.println("Employee id does not exist for id: "+eid);
		}
		
		return "index.jsp"; 
	}
	
	@RequestMapping("/displayAllEmp")
	@ResponseBody
	public Iterable<Employee> displayAllEmployees() {
		return dao.findAll();
	}
	
	@RequestMapping("/findByDesignation")
	@ResponseBody
	public List<Employee> findByDesignation(String designation) {
		return dao.findByDesignation(designation);
	}
	
	@RequestMapping("/findByAge")
	@ResponseBody
	public List<Employee> findByAge(int age) {
		return dao.findByAgeGreaterThan(age);
	}
	
	@RequestMapping("/findByDesignationSortAge")
	@ResponseBody
	public List<Employee> findByDesignationSortAge(String designation) {
		return dao.selectDesigSortAge(designation);
	}
	
}
