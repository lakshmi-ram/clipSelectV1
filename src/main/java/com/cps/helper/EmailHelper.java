package com.cps.helper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.cps.domain.User;

@Component
public class EmailHelper {

    @Autowired
    private JavaMailSender sender;
    
	public void sendMail(User userDetails, String appUrl) throws MessagingException {
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		appUrl = appUrl.replace("/register", "");
		String confUrl = appUrl+"/activate?userName="+userDetails.getUserName()+"&token="+userDetails.getActivationCode();
		helper.setFrom("clipselect1@gmail.com");
		helper.setTo(userDetails.getEmail());
		helper.setText("Please click on the link to activate your account. " + confUrl);
		helper.setSubject("Activation link enclosed");
		sender.send(message);
	}
}
