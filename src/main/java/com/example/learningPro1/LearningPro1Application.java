package com.example.learningPro1;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningPro1Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(LearningPro1Application.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "9003"));
        app.run(args);
	//	SpringApplication.run(LearningPro1Application.class, args);
	}

}
