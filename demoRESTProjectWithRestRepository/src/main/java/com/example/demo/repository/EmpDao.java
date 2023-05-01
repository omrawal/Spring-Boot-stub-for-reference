package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Employee;

@RepositoryRestResource(collectionResourceRel = "employees")
public interface EmpDao extends JpaRepository<Employee, Integer> {

}
