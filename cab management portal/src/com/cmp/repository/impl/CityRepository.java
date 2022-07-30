package com.cmp.repository.impl;

import java.util.HashMap;
import java.util.Map;

import com.cmp.exceptions.CabNotFoundException;
import com.cmp.model.City;
import com.cmp.model.Location;
import com.cmp.repository.ICityRepository;

public class CityRepository implements ICityRepository {
	
	public static final CityRepository CITY_REPOSITORY = new CityRepository();

	Map<String, City> citiesMap = new HashMap<>();

	private CityRepository() {
		initialCityLoad();
	}

	public void initialCityLoad() {
		citiesMap.put("Pune", new City(1, "Pune", new Location(18.516726, 73.856255)));
		citiesMap.put("Mumbai", new City(2, "Mumbai", new Location(19.076090, 72.877426)));
		citiesMap.put("Bangalore", new City(3, "Bangalore", new Location(12.972442, 77.580643)));
	}

	@Override
	public void insert(City city) {
		citiesMap.put(city.getName(), city);
	}

	public Map<String, City> getCityMap() {
		Map<String, City> tempCitesMap = new HashMap<>();
		tempCitesMap.putAll(citiesMap);
		return tempCitesMap;
	}

	@Override
	public City getCity(String name) {
		return citiesMap.get(name);
	}

	@Override
	public void checkCityPresent(String cityName) throws CabNotFoundException {
		if (!citiesMap.containsKey(cityName)) {
			throw new CabNotFoundException("City not available in database with name " + cityName);
		}
	}

}
