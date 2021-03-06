package com.cps.service;

import org.springframework.stereotype.Component;

import com.cps.domain.User;
import com.cps.vo.LoginCredentials;
import com.cps.vo.PasswordReset;

@Component
public interface CPSLoginService {
	public String loginSubmit(LoginCredentials loginCredentials);
	public String register(User userDetails, String appUrl);
	public String forgotPassword(PasswordReset passwordReset);
	public String activate(String userName, String token);	
}
