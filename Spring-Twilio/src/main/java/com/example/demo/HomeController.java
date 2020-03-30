package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value="/twilioApi", method=RequestMethod.POST )
	@ResponseBody
	public String twilioApi(@RequestBody SmsRequest smsRequest) {		
		
		TwilioSmsSender twilioSmsSender = new TwilioSmsSender();
		twilioSmsSender.sendSms(smsRequest);
			
		return "Successfully Send..";	
	}
	
}
