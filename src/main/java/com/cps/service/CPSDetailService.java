package com.cps.service;

import org.springframework.stereotype.Component;

import com.cps.vo.ProcessVO;

@Component
public interface CPSDetailService {
	public String countrySubmit(ProcessVO processVO);
	public String zipOrZoneSubmit(ProcessVO processVO, ProcessVO processVOFromSession);		
}
