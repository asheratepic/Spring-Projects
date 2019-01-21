package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		//to tell the Servlet container to start this spring boot app
		SpringApplication.run(CourseApiApp.class, args);
	}

}
