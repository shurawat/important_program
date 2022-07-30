package com.cmp.services.impl;

import com.cmp.exceptions.CabAlreadyRegisteredException;
import com.cmp.model.Cab;
import com.cmp.repository.ICabRepository;
import com.cmp.services.ICabRegistrationService;

public class CabRegistrationService implements ICabRegistrationService {
	
	private ICabRepository cabRepository;
		
	public CabRegistrationService(ICabRepository cabRepository) {
		super();
		this.cabRepository = cabRepository;
	}

	@Override
	public void registerNewCab(Cab cab) throws CabAlreadyRegisteredException {
		if(cabRepository.getCabById(cab.getId()) != null) {
			throw new CabAlreadyRegisteredException("Cab already registered with Id " + cab.getId());
		}
		cabRepository.insert(cab);

	}

}
