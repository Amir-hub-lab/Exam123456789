package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		PatternFactory factory = new PatternFactory();
		A Navat = factory.getPlace(Place.R);
		A Ticketon = factory.getPlace(Place.T);
		A Broadvey = factory.getPlace(Place.C);
		Navat.get();
		Ticketon.get();
		Broadvey.get();
		SpringApplication.run(DemoApplication.class, args);
	}

}
