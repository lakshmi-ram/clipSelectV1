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

	@Override
	public String landTypeSubmit(ProcessVO processVO, ProcessVO processVOFromSession) {
		if(null != processVO.getLandType()){
			processVOFromSession.setLandType(processVO.getLandType());
		}else {
			return "landType";
		}
		return "height";
	}

	@Override
	public String heightSubmit(ProcessVO processVO, ProcessVO processVOFromSession) {
		if(null != processVO.getHeight()){
			processVOFromSession.setHeight(processVO.getHeight());
		}else {
			return "height";
		}
		return "roofTileMfrSubmit";
	}
	
	@Override
	public String roofTileMfrSubmit(ProcessVO processVO, ProcessVO processVOFromSession) {
		if(null != processVO.getRoofTileMfr()){
			processVOFromSession.setRoofTileMfr(processVO.getRoofTileMfr());
		}else {
			return "roofTileMfrSubmit";
		}
		return "roofTile";
	}

	@Override
	public String roofTileSubmit(ProcessVO processVO, ProcessVO processVOFromSession) {
		if(null != processVO.getRoofTile()){
			processVOFromSession.setRoofTile(processVO.getRoofTile());
		}else {
			return "roofTile";
		}
		return "roofTileCovering";
	}

	@Override
	public String roofTileCoveringSubmit(ProcessVO processVO, ProcessVO processVOFromSession) {
		if(null != processVO.getLength() && null != processVO.getWidth() && null != processVO.getNoOfTile()){
			processVOFromSession.setLength(processVO.getLength());
			processVOFromSession.setWidth(processVO.getWidth());
			processVOFromSession.setNoOfTile(processVO.getNoOfTile());		
		}else {
			return "roofTileCovering";
		}
		return "batten";
	}

	@Override
	public String battenSubmit(ProcessVO processVO, ProcessVO processVOFromSession) {
		if(null != processVO.getBatten()){
			processVOFromSession.setBatten(processVO.getBatten());
		}else {
			return "batten";
		}
		return "roofType";
	}

	@Override
	public String roofTypeSubmit(ProcessVO processVO, ProcessVO processVOFromSession) {
		if(null != processVO.getRoofType()){
			processVOFromSession.setRoofType(processVO.getRoofType());
		}else {
			return "roofType";
		}
		return "buildingDim";
	}

	@Override
	public String buildingDimSubmit(ProcessVO processVO, ProcessVO processVOFromSession) {
		if(null != processVO.getBuildingHeight() && null != processVO.getPitch() && null != processVO.getSizeA() 
				&& null != processVO.getSizeB() && null != processVO.getSubstrate()){
			processVOFromSession.setBuildingHeight(processVO.getBuildingHeight());
			processVOFromSession.setPitch(processVO.getPitch());
			processVOFromSession.setSizeA(processVO.getSizeA());
			processVOFromSession.setSizeB(processVO.getSizeB());
			processVOFromSession.setSubstrate(processVO.getSubstrate());
		}else {
			return "buildingDim";
		}
		return "tAndC";
	}

	@Override
	public String tAndCSubmit(ProcessVO processVO, ProcessVO processVOFromSession) {
		if(null != processVO.getAgree()){
			processVOFromSession.setAgree(processVO.getAgree());
		}else {
			return "tAndC";
		}
		return "calculate";
	}
		
}
