package com.example.demo;

import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;

@Service
public class TwilioSmsSender {

	public void sendSms(SmsRequest smsRequest) {
		
		Twilio.init("ACfacc71991b6f7d5dbbf3d5ac19b74ae1","c5620898cb0f06b5ab5505c3de5e5ef3");		
		
		PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
        PhoneNumber from = new PhoneNumber("+12094271376");
        String msg = smsRequest.getMessage();
        MessageCreator creator = Message.creator(to, from, msg);
        creator.create();
		
		System.out.println("sending..");
	}
}
