package com.cps.service;

import org.springframework.stereotype.Component;

import com.cps.vo.ProcessVO;

@Component
public interface CPSDetailService {
	public String countrySubmit(ProcessVO processVO);
	public String zipOrZoneSubmit(ProcessVO processVO, ProcessVO processVOFromSession);
	public String landTypeSubmit(ProcessVO processVO, ProcessVO processVOFromSession);
	public String heightSubmit(ProcessVO processVO, ProcessVO processVOFromSession);
	public String roofTileMfrSubmit(ProcessVO processVO, ProcessVO processVOFromSession);
	public String roofTileSubmit(ProcessVO processVO, ProcessVO processVOFromSession);
	public String roofTileCoveringSubmit(ProcessVO processVO, ProcessVO processVOFromSession);
	public String battenSubmit(ProcessVO processVO, ProcessVO processVOFromSession);
	public String roofTypeSubmit(ProcessVO processVO, ProcessVO processVOFromSession);
	public String buildingDimSubmit(ProcessVO processVO, ProcessVO processVOFromSession);
	public String tAndCSubmit(ProcessVO processVO, ProcessVO processVOFromSession);
}
