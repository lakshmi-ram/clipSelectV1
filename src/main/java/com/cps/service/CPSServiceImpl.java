package com.cps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cps.domain.User;
import com.cps.repository.UserRepo;
import com.cps.vo.LoginCredentials;

@Component
public class CPSServiceImpl implements CPSService{

	@Autowired
	private UserRepo userRepo;
	
	public String loginSubmit(LoginCredentials loginCredentials) {
		User user = userRepo.findOne(loginCredentials.getUserName());
		if(null!= user && "Y".equalsIgnoreCase(user.getActive())) {
			return "active";
		}else if(null!= user && "N".equalsIgnoreCase(user.getActive())){
			return "inactive";
		}else{
			return "register";
		}
	}

	@Override
	public String register(User userDetails) {
		User user = userRepo.save(userDetails);
		if(null!=user){
			
			return "registerSuccess";
		}else {
			return "error";
		}
	}
}
