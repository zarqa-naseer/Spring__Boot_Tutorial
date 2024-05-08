package com.in28minutes.springboot.Springboot_Tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootTutorialApplication extends SpringBootServletInitializer   {
	@Override  
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)   
	{  
	return application.sources(SpringbootTutorialApplication.class);  
	}  
	public static void main(String[] args) {
		SpringApplication.run(SpringbootTutorialApplication.class, args);
	}

}
