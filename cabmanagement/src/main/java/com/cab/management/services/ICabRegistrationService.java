package com.cab.management.services;

import com.cab.management.exceptions.CabAlreadyRegisteredException;
import com.cab.management.model.cab.Cab;

public interface ICabRegistrationService {
	
	public void registerNewCab(Cab cab) throws CabAlreadyRegisteredException; 

}
 