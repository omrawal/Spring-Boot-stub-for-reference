package com.example.demo.repository;

import java.lang.annotation.Native;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Employee;

//public interface EmpDao extends CrudRepository<Employee, Integer> {
//
//}
public interface EmpDao extends JpaRepository<Employee, Integer> {
	public List<Employee>findByDesignation(String designation);
	public List<Employee>findByAgeGreaterThan(int age);
	
	@Query("from employee where designation=?1 order by age") // ?1 first parameter of function
	public List<Employee>selectDesigSortAge(String designation);
	
//	@Native("Here goes database specific query") 
}
