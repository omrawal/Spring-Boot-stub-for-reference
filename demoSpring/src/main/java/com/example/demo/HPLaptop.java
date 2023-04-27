package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("hp")
@Primary
public class HPLaptop implements Laptop {

	@Override
	public String display() {
		return ("This is HP laptop");
	}

}
