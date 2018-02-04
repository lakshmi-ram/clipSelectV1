package com.cps.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cps.domain.User;
import com.cps.helper.EmailHelper;
import com.cps.repository.UserRepo;
import com.cps.vo.LoginCredentials;

@Component
public class CPSServiceImpl implements CPSService{

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	EmailHelper emailHelper;
	
	public String loginSubmit(LoginCredentials loginCredentials) {
		try {
			User user = userRepo.findOne(loginCredentials.getUserName());
			if(null!= user && "Y".equalsIgnoreCase(user.getActive())) {
				return "active";
			}else if(null!= user && "N".equalsIgnoreCase(user.getActive())){
				return "inactive";
			}else{
				return "register";
			}
		}catch(Exception e) {
			return "error";
		}
	}

	@Override
	public String register(User userDetails, String appUrl) {
		try {
			String token = UUID.randomUUID().toString();
			userDetails.setActivationCode(token);
			userDetails.setActive("N");			
			User user = userRepo.save(userDetails);
			if(null!=user){							
				emailHelper.sendMail(userDetails, appUrl);
				return "registerSuccess";
			}else {
				return "error";
			}
		}catch(Exception e) {
			return "error";
		}
	}

	@Override
	public String activate(String userName, String token) {
		try {
			User user = userRepo.findOne(userName);
			if(null!= user && user.getActivationCode().equalsIgnoreCase(token)) {
				user.setActive("Y");
				userRepo.delete(userName);
				userRepo.save(user);
				return "active";
			}else {
				return "error";
			}			
		}catch(Exception e) {
			return "error";
		}
	}
}
