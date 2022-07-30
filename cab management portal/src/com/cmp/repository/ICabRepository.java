package com.cmp.repository;

import java.util.Optional;

import com.cmp.enums.CabState;
import com.cmp.enums.CabType;
import com.cmp.exceptions.CabNotFoundException;
import com.cmp.model.Cab;
import com.cmp.model.City;

public interface ICabRepository {


	public Cab getCabById(String id);

	public void insert(Cab cab);

	public void updateCabCity(String cabId, String cityName);

	public void updateCabState(String cabId, CabState cabState) throws CabNotFoundException;

	public Optional<Cab> getCabToBook(City from, CabType type);

}
