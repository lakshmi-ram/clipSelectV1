package com.cps.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cps.domain.User;
import com.cps.service.CPSLoginService;
import com.cps.vo.LoginCredentials;
import com.cps.vo.PasswordReset;

@RestController
public class CPSLoginController {
	
	@Autowired
	CPSLoginService cpsService;
	
	/*
	 * active opens webapp
	 * register - Register.html
	 * inactive - click mail link to activate
	 */
	@RequestMapping(value = "/loginSubmit", method = RequestMethod.POST)
	public String loginSubmit(HttpServletRequest req, HttpServletResponse res, @RequestBody LoginCredentials loginCredentials) {
		String result = cpsService.loginSubmit(loginCredentials);
		if(result.equalsIgnoreCase("country")) {
			req.getSession().setAttribute("loggedIn", "Y");
		}
		return result;
	}

	@RequestMapping(value = "/forgotPassword", method = RequestMethod.POST)
	public String resetPassword(HttpServletRequest req, HttpServletResponse res, @RequestBody PasswordReset passwordReset) {
		String result = cpsService.forgotPassword(passwordReset);
		return result;
	}
	
	/*
	 * activate -click on mail to activate
	 * error - Please try again
	 * inactive - click mail link to activate
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(HttpServletRequest req, HttpServletResponse res, @RequestBody User userDetail) {
		String result = cpsService.register(userDetail, req.getRequestURL().toString());
		return result;
	}
		
	@RequestMapping(value = "/activate", method = RequestMethod.GET)
	public String activate(HttpServletRequest req, HttpServletResponse res, @RequestParam String userName, @RequestParam String token) {
		String result = cpsService.activate(userName, token);
		return result;
	}
}
