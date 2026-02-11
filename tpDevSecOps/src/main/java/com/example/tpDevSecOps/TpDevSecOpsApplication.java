package com.example.tpDevSecOps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpDevSecOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpDevSecOpsApplication.class, args);
	}

}

@RestController
class HelloWorldController{
	@GetMapping("/")
	public  String sayHello(){
		return "Hello World";
	}
}
