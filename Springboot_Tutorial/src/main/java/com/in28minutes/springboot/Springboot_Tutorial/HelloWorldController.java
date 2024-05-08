package com.in28minutes.springboot.Springboot_Tutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class HelloWorldController   
{  
@RequestMapping("/hello")  
public String hello()   
{  
return "Hello javaTpoint";  
}  
}  