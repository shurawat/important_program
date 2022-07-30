package com.cmp.services.impl;

import com.cmp.exceptions.CityAlreadyPresentException;
import com.cmp.model.City;
import com.cmp.repository.ICityRepository;
import com.cmp.services.ICityOnboardingService;

public class CityOnboardingService implements ICityOnboardingService {

	private ICityRepository cityRepository;
	
	public CityOnboardingService(ICityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}

	@Override
	public void addNewCity(City city) throws CityAlreadyPresentException {
		if(cityRepository.getCity(city.getName()) != null) {
			throw new CityAlreadyPresentException("Cannot create new city as City already exist with name " + city.getName());
		}
		cityRepository.insert(city);
	}

}
