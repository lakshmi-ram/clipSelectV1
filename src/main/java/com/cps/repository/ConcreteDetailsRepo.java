package com.cps.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cps.domain.ConcreteDetails;

public interface ConcreteDetailsRepo extends CrudRepository<ConcreteDetails, String> {
	
	//List<ConcreteDetails> findDistinctMfr();
	List<ConcreteDetails> findByMfr(String mfr);
	List<ConcreteDetails> findByMfrAndRoofTile(String mfr, String roofTile);
}
