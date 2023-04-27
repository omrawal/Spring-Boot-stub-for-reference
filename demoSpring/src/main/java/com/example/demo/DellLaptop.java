package com.example.demo;

import org.springframework.stereotype.Component;

@Component("dell")
public class DellLaptop implements Laptop {

	@Override
	public String display() {
		return ("This is a dell laptop");
		
	}

}
