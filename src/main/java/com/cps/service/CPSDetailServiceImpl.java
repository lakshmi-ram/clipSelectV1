package com.cps.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cps.domain.ConcreteDetails;
import com.cps.domain.ZipCodeWindZone;
import com.cps.repository.ConcreteDetailsRepo;
import com.cps.repository.ZipCodeWindZoneRepo;
import com.cps.vo.ProcessVO;

@Component
public class CPSDetailServiceImpl implements CPSDetailService{

	@Autowired
	ZipCodeWindZoneRepo zipCodeWindZoneRepo;
	
	@Autowired
	ConcreteDetailsRepo concreteDetailsRepo;
	
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
			String zipcode = processVO.getZipcode();
			ZipCodeWindZone zipCodeWindZone = zipCodeWindZoneRepo.findOne(zipcode);
			String windZone = zipCodeWindZone.getWindZone();
			processVOFromSession.setWindZone(windZone);
			processVOFromSession.setZipcode(zipcode);			
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
			List<ConcreteDetails> concreteDetailsList = (List<ConcreteDetails>) concreteDetailsRepo.findAll();
			List<ConcreteDetails> mfrList  = new ArrayList<ConcreteDetails>();
			List<String> mfrNameList = new ArrayList<>();
			for(ConcreteDetails concreteDetails :concreteDetailsList) {				
				if(!mfrNameList.contains(concreteDetails.getMfr())) {
					mfrNameList.add(concreteDetails.getMfr());
					mfrList.add(concreteDetails);
				}
			}
			processVOFromSession.setMfrList(mfrList);
			processVOFromSession.setResult("roofTileMfr");
		}else {
			processVOFromSession.setResult("height");
			return "height";
		}
		return "roofTileMfr";
	}
	
	@Override
	public String roofTileMfrSubmit(ProcessVO processVO, ProcessVO processVOFromSession) {
		if(null != processVO.getRoofTileMfr()){
			processVOFromSession.setRoofTileMfr(processVO.getRoofTileMfr());
			List<ConcreteDetails> concreteDetailsList = concreteDetailsRepo.findByMfr(processVO.getRoofTileMfr());
			List<String> roofTileList  = new ArrayList<String>();
			for(ConcreteDetails concreteDetails :concreteDetailsList) {
				roofTileList.add(concreteDetails.getRoofTile());
			}
			processVOFromSession.setRoofTileList(roofTileList);
			processVOFromSession.setResult("roofTile");
		}else {
			processVOFromSession.setResult("roofTileMfr");
			return "roofTileMfr";
		}
		return "roofTile";
	}

	@Override
	public String roofTileSubmit(ProcessVO processVO, ProcessVO processVOFromSession) {
		if(null != processVO.getRoofTile()){
			processVOFromSession.setRoofTile(processVO.getRoofTile());
			List<ConcreteDetails> concreteDetailsList = concreteDetailsRepo.findByMfrAndRoofTile(processVO.getRoofTileMfr(), processVO.getRoofTile());
			/*ConcreteDetails concreteDetails = concreteDetailsList.get(0);
			processVOFromSession.setLength(concreteDetails.getLength());
			processVOFromSession.setWidth(concreteDetails.getWidth());
			processVOFromSession.setNoOfTile(concreteDetails.getNoOfTile());*/
			processVOFromSession.setResult("roofTileCovering");
		}else {
			processVOFromSession.setResult("roofTile");
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
