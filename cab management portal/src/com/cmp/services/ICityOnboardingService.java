package com.cmp.services;

import com.cmp.exceptions.CityAlreadyPresentException;
import com.cmp.model.City;

public interface ICityOnboardingService {
	
	public void addNewCity(City city) throws CityAlreadyPresentException;

}
