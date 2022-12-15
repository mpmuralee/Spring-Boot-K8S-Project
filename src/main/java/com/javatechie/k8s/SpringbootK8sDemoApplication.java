package com.javatechie.k8s;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sDemoApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringbootK8sDemoApplication.class);
	   
    

	@GetMapping("/message")
	public String displayMessage(){
		 logger.info("this is a info message");
	     logger.warn("this is a warn message");
	     logger.error("this is a error message");
		return "Congratulation you successfully deployed your application to kubernetes !!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sDemoApplication.class, args);
	}

}
