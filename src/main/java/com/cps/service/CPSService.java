package com.cps.service;

import org.springframework.stereotype.Component;

import com.cps.vo.LoginCredentials;

@Component
public interface CPSService {
	public String loginSubmit(LoginCredentials loginCredentials);
}
