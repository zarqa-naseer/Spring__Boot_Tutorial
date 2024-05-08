package com.in28minutes.springboot.Springboot_Tutorial;

import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepo extends JpaRepository <customer, String>{

}
