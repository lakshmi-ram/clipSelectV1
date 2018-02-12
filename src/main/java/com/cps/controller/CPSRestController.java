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
		String result = "error";
		try {
			if ("Y".equalsIgnoreCase((String) req.getSession().getAttribute("loggedIn"))) {
				result = cpsDetailService.countrySubmit(processVO);
				req.getSession().setAttribute("processVO", processVO);
			}
		} catch (Exception e) {
			result = "error";
		}
		return result;
	}

	@RequestMapping(value = "/zipOrZoneSubmit", method = RequestMethod.POST)
	public String zipOrZoneSubmit(HttpServletRequest req, HttpServletResponse res, @RequestBody ProcessVO processVO) {
		String result = "error";
		try {
			if ("Y".equalsIgnoreCase((String) req.getSession().getAttribute("loggedIn"))) {
				ProcessVO processVOFromSession = (ProcessVO) req.getSession().getAttribute("processVO");
				result = cpsDetailService.zipOrZoneSubmit(processVO, processVOFromSession);
				req.getSession().setAttribute("processVO", processVOFromSession);
			}
		} catch (Exception e) {
			result = "error";
		}
		return result;
	}

	@RequestMapping(value = "/landTypeSubmit", method = RequestMethod.POST)
	public String landTypeSubmit(HttpServletRequest req, HttpServletResponse res, @RequestBody ProcessVO processVO) {
		String result = "error";
		try {
			if ("Y".equalsIgnoreCase((String) req.getSession().getAttribute("loggedIn"))) {
				ProcessVO processVOFromSession = (ProcessVO) req.getSession().getAttribute("processVO");
				result = cpsDetailService.landTypeSubmit(processVO, processVOFromSession);
				req.getSession().setAttribute("processVO", processVOFromSession);
			}
		} catch (Exception e) {
			result = "error";
		}
		return result;
	}

	@RequestMapping(value = "/heightSubmit", method = RequestMethod.POST)
	public ProcessVO heightSubmit(HttpServletRequest req, HttpServletResponse res, @RequestBody ProcessVO processVO) {
		ProcessVO processVOFromSession = null;
		try {
			if ("Y".equalsIgnoreCase((String) req.getSession().getAttribute("loggedIn"))) {
				processVOFromSession = (ProcessVO) req.getSession().getAttribute("processVO");
				String result = cpsDetailService.heightSubmit(processVO, processVOFromSession);
				req.getSession().setAttribute("processVO", processVOFromSession);
			}
		} catch (Exception e) {
			processVOFromSession = new ProcessVO();
			processVOFromSession.setResult("error");
		}
		return processVOFromSession;
	}

	@RequestMapping(value = "/roofTileMfrSubmit", method = RequestMethod.POST)
	public ProcessVO roofTileMfrSubmit(HttpServletRequest req, HttpServletResponse res,
			@RequestBody ProcessVO processVO) {
		ProcessVO processVOFromSession = null;
		try {
			if ("Y".equalsIgnoreCase((String) req.getSession().getAttribute("loggedIn"))) {
				processVOFromSession = (ProcessVO) req.getSession().getAttribute("processVO");
				String result = cpsDetailService.roofTileMfrSubmit(processVO, processVOFromSession);
				req.getSession().setAttribute("processVO", processVOFromSession);
			}
		} catch (Exception e) {
			processVOFromSession = new ProcessVO();
			processVOFromSession.setResult("error");
		}
		return processVOFromSession;
	}

	@RequestMapping(value = "/roofTileSubmit", method = RequestMethod.POST)
	public ProcessVO roofTileSubmit(HttpServletRequest req, HttpServletResponse res, @RequestBody ProcessVO processVO) {
		ProcessVO processVOFromSession = null;
		try {
			if ("Y".equalsIgnoreCase((String) req.getSession().getAttribute("loggedIn"))) {
				processVOFromSession = (ProcessVO) req.getSession().getAttribute("processVO");
				String result = cpsDetailService.roofTileSubmit(processVO, processVOFromSession);
				req.getSession().setAttribute("processVO", processVOFromSession);
			}
		} catch (Exception e) {
			processVOFromSession = new ProcessVO();
			processVOFromSession.setResult("error");
		}
		return processVOFromSession;
	}

	@RequestMapping(value = "/roofTileCoveringSubmit", method = RequestMethod.POST)
	public String roofTileCoveringSubmit(HttpServletRequest req, HttpServletResponse res,
			@RequestBody ProcessVO processVO) {
		String result = "error";
		try {
			if ("Y".equalsIgnoreCase((String) req.getSession().getAttribute("loggedIn"))) {
				ProcessVO processVOFromSession = (ProcessVO) req.getSession().getAttribute("processVO");
				result = cpsDetailService.roofTileCoveringSubmit(processVO, processVOFromSession);
				req.getSession().setAttribute("processVO", processVOFromSession);
			}
		} catch (Exception e) {
			result = "error";
		}
		return result;
	}

	@RequestMapping(value = "/battenSubmit", method = RequestMethod.POST)
	public String battenSubmit(HttpServletRequest req, HttpServletResponse res, @RequestBody ProcessVO processVO) {
		String result = "error";
		try {
			if ("Y".equalsIgnoreCase((String) req.getSession().getAttribute("loggedIn"))) {
				ProcessVO processVOFromSession = (ProcessVO) req.getSession().getAttribute("processVO");
				result = cpsDetailService.battenSubmit(processVO, processVOFromSession);
				req.getSession().setAttribute("processVO", processVOFromSession);
			}
		} catch (Exception e) {
			result = "error";
		}
		return result;
	}

	@RequestMapping(value = "/roofTypeSubmit", method = RequestMethod.POST)
	public String roofTypeSubmit(HttpServletRequest req, HttpServletResponse res, @RequestBody ProcessVO processVO) {
		String result = "error";
		try {
			if ("Y".equalsIgnoreCase((String) req.getSession().getAttribute("loggedIn"))) {
				ProcessVO processVOFromSession = (ProcessVO) req.getSession().getAttribute("processVO");
				result = cpsDetailService.roofTypeSubmit(processVO, processVOFromSession);
				req.getSession().setAttribute("processVO", processVOFromSession);
			}
		} catch (Exception e) {
			result = "error";
		}
		return result;
	}

	@RequestMapping(value = "/buildingDimSubmit", method = RequestMethod.POST)
	public String buildingDimSubmit(HttpServletRequest req, HttpServletResponse res, @RequestBody ProcessVO processVO) {
		String result = "error";
		try {
			if ("Y".equalsIgnoreCase((String) req.getSession().getAttribute("loggedIn"))) {
				ProcessVO processVOFromSession = (ProcessVO) req.getSession().getAttribute("processVO");
				result = cpsDetailService.buildingDimSubmit(processVO, processVOFromSession);
				req.getSession().setAttribute("processVO", processVOFromSession);
			}
		} catch (Exception e) {
			result = "error";
		}
		return result;
	}

	@RequestMapping(value = "/tAndCSubmit", method = RequestMethod.POST)
	public String tAndCSubmit(HttpServletRequest req, HttpServletResponse res, @RequestBody ProcessVO processVO) {
		String result = "error";
		try {
			if ("Y".equalsIgnoreCase((String) req.getSession().getAttribute("loggedIn"))) {
				ProcessVO processVOFromSession = (ProcessVO) req.getSession().getAttribute("processVO");
				result = cpsDetailService.tAndCSubmit(processVO, processVOFromSession);
				req.getSession().setAttribute("processVO", processVOFromSession);
			}
		} catch (Exception e) {
			result = "error";
		}
		return result;
	}
}
