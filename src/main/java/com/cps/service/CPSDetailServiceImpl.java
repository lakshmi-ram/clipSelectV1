package com.cps.service;

import org.springframework.stereotype.Component;

import com.cps.vo.ProcessVO;

@Component
public class CPSDetailServiceImpl implements CPSDetailService{

	@Override
	public String countrySubmit(ProcessVO processVO) {
		if(null != processVO.getCountry())
			return "zipOrZone";
		else
			return "country";
	}

	@Override
	public String zipOrZoneSubmit(ProcessVO processVO, ProcessVO processVOFromSession) {
		if(null != processVO.getWindZone()){
			processVOFromSession.setWindZone(processVO.getWindZone());
		}else if(null!= processVO.getZipcode()){
			processVOFromSession.setZipcode(processVO.getZipcode());
		}else {
			return "zipOrZone";
		}
		return "landType";
	}
	
	
}
