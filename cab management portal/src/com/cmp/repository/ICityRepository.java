package com.cmp.repository;

import java.util.Map;

import com.cmp.exceptions.CabNotFoundException;
import com.cmp.model.City;

public interface ICityRepository {

	public void insert(City city);

	public Map<String, City> getCityMap();

	public City getCity(String name);

	public void checkCityPresent(String cityName) throws CabNotFoundException;

}
