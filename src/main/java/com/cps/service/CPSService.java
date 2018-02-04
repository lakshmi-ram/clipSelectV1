package com.cps.service;

import org.springframework.stereotype.Component;

import com.cps.domain.User;
import com.cps.vo.LoginCredentials;

@Component
public interface CPSService {
	public String loginSubmit(LoginCredentials loginCredentials);
	public String register(User userDetails, String appUrl);
	public String activate(String userName, String token);
}
