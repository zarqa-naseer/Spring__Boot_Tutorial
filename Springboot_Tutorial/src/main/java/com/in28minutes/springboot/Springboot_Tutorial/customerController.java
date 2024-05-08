package com.in28minutes.springboot.Springboot_Tutorial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerdata")
public class customerController {
private final customerRepo cr;
@Autowired
public customerController(customerRepo cr) {
    this.cr = cr;
}
@GetMapping
public List<customer> getAllCustomers() {
    return cr.findAll();
}

}
