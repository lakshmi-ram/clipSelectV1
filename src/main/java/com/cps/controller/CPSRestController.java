package com.cps.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cps.service.CPSDetailService;
import com.cps.vo.ProcessVO;

@RestController
public class CPSRestController {
	
	@Autowired
	CPSDetailService cpsDetailService;
	
	@RequestMapping(value = "/countrySubmit", method = RequestMethod.POST)
	public String countrySubmit(HttpServletRequest req, HttpServletResponse res, @RequestBody ProcessVO processVO) {
		String result = cpsDetailService.countrySubmit(processVO);
		req.getSession().setAttribute("processVO", processVO);
		return result;
	}

	@RequestMapping(value = "/zipOrZoneSubmit", method = RequestMethod.POST)
	public String zipOrZoneSubmit(HttpServletRequest req, HttpServletResponse res, @RequestBody ProcessVO processVO) {
		ProcessVO processVOFromSession = (ProcessVO) req.getSession().getAttribute("processVO");
		String result = cpsDetailService.zipOrZoneSubmit(processVO, processVOFromSession);
		req.getSession().setAttribute("processVO", processVOFromSession);
		return result;
	}
	
}
