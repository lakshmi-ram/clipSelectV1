package com.cps.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cps.service.CPSService;
import com.cps.vo.LoginCredentials;

@RestController
public class CPSRestController {
	
	@Autowired
	CPSService cpsService;
	
	/*
	 * active opens webapp
	 * register - Register.html
	 * inactive - click mail link to activate
	 */
	@RequestMapping(value = "/loginSubmit", method = RequestMethod.POST)
	public String loginSubmit(HttpServletRequest req, HttpServletResponse res, @RequestBody LoginCredentials loginCredentials) {
		String result = cpsService.loginSubmit(loginCredentials);
		return result;
	}

	@RequestMapping(value = "/forgotPassword", method = RequestMethod.POST)
	public String resetPassword(HttpServletRequest req, HttpServletResponse res) {
		return "success";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(HttpServletRequest req, HttpServletResponse res) {
		return "success";
	}
}
