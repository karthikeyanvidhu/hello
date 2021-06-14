package com.hps.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
		}
	
	  @GetMapping({"/"})
	  public String chkk()  { 
		  return "Hello World.Updated Version 3.0 ";
	  }
	  
	  @GetMapping({"/hello"})
	  public String chk()  { 
		  return "Hello ,Application is UP";
	  }
	  
	  @GetMapping({"/hello/world"})
	  public String wlk()  { 
		  return "Hello world ,Application is UP";
	  }
	  
}


