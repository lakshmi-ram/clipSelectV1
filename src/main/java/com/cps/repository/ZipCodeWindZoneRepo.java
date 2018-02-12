package com.cps.repository;

import org.springframework.data.repository.CrudRepository;

import com.cps.domain.ZipCodeWindZone;

public interface ZipCodeWindZoneRepo extends CrudRepository<ZipCodeWindZone, String> {
	
}
