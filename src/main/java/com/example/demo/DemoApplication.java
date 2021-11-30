package com.example.demo;

import java.util.List;

import com.example.demo.Students.Students;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Students> hello(){
		return  List.of(
			new Students(
			1L,
			"Donnex",
			22,
			 "bed-com-15-19@unima.ac.mw",
			 "23,05,1999")
		);
	}

}
