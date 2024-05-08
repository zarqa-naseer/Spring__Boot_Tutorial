package com.in28minutes.springboot.Springboot_Tutorial;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class customer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "customerid")
private String customerId;
	 @Column(name = "licensetype")
private String licenseType;
	 @Column(name = "servertype")
private String serverType;
public String getcustomerId() {
	return customerId;
}
public String getlicenseType() {
	return licenseType;
}
public String getserverType() {
	return serverType;
}
public void setcustomerId(String customerId) {
	this.customerId = customerId;
}
public void setlicenseType(String licenseType) {
	this.licenseType = licenseType;
}
public void setserverType(String serverType) {
	this.serverType=serverType;
}
}
