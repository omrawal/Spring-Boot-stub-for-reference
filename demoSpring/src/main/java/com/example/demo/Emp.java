package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("employee")
//@Scope(value="prototype") //value is singleton by default
//@Lazy()
public class Emp {
	private String name="no_name_assigned";
	private int age=0;
	private String designation="no_designation_assigned";
	private int salary=0;
	@Autowired
	private Address address;
	
	@Autowired
	@Qualifier("dell")
	private Laptop laptop;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(DellLaptop laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", designation=" + designation + ", salary=" + salary
				+ ", address=" + address + ", laptop=" + laptop.display() + "]";
	}
	
}
