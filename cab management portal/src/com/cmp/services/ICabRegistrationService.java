package com.cmp.services;

import com.cmp.exceptions.CabAlreadyRegisteredException;
import com.cmp.model.Cab;

public interface ICabRegistrationService {
	
	public void registerNewCab(Cab cab) throws CabAlreadyRegisteredException; 

}
 