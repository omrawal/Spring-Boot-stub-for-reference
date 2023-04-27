package com.example.demo;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DemoSpringApplication.class, args);
		System.out.println("From spring boot application");
//		Emp e1=context.getBean(Emp.class);
//		Emp e1=context.getBean("employee",Emp.class);
//		Object e1=context.getBean("employee");
//		System.out.println(e1);
		System.out.println("Enter name to create object");
		Object obj1=context.getBean(new Scanner(System.in).next());
		System.out.println(obj1);
	}

}
