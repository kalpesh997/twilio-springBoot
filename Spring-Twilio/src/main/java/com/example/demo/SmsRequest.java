package com.example.demo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SmsRequest {

	private String phoneNumber;	
	private String message;
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
