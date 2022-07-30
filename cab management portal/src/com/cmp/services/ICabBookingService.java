package com.cmp.services;

import com.cmp.enums.CabType;
import com.cmp.exceptions.CabNotAvailableException;
import com.cmp.exceptions.CityNotFoundException;
import com.cmp.model.Cab;

public interface ICabBookingService {
	
	public Cab bookCab(String customerId, CabType type, String from, String to) throws CabNotAvailableException, CityNotFoundException;

}
