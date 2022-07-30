package com.cmp.repository.impl;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.cmp.enums.CabState;
import com.cmp.enums.CabType;
import com.cmp.exceptions.CabNotFoundException;
import com.cmp.model.Cab;
import com.cmp.model.City;
import com.cmp.repository.ICabRepository;
import com.cmp.repository.ICityRepository;

public class CabRepository implements ICabRepository{
	
	private static ICabRepository cabRepository;

	private ICityRepository cityRepository;
	
	private CabRepository(ICityRepository cityRepository) {
		this.cityRepository = cityRepository;
		initialCabLoad();
	}
	
	public static ICabRepository getInstance(ICityRepository cityRepository) {
		if(cabRepository == null ) {
			cabRepository = new CabRepository(cityRepository);
		}
		return cabRepository;
	}

	Map<String, Cab> cabsMap = new HashMap<>();

	public void initialCabLoad() {
		cabsMap.put("MH-12-GL-1328", new Cab("MH-12-GL-1328", CabType.HATCHBACK, cityRepository.getCity("Pune")));
		cabsMap.put("MH-12-GL-1329", new Cab("MH-12-GL-1329", CabType.PRIME_SEDAN, cityRepository.getCity("Pune")));
		cabsMap.put("MH-12-GL-1330", new Cab("MH-12-GL-1330", CabType.SEDAN, cityRepository.getCity("Pune")));
		cabsMap.put("MH-12-GL-1331", new Cab("MH-12-GL-1331", CabType.SEVEN_SEATER, cityRepository.getCity("Mumbai")));
		cabsMap.put("MH-12-GL-1332", new Cab("MH-12-GL-1332", CabType.PRIME_SEDAN, cityRepository.getCity("Mumbai")));
		cabsMap.put("MH-12-GL-1333", new Cab("MH-12-GL-1333", CabType.HATCHBACK, cityRepository.getCity("Bangalore")));
		cabsMap.put("MH-12-GL-1334", new Cab("MH-12-GL-1334", CabType.SEDAN, cityRepository.getCity("Bangalore")));
	}

	@Override
	public Cab getCabById(String id) {
		return cabsMap.get(id);
	}

	@Override
	public void insert(Cab cab) {
		cabsMap.put(cab.getId(), cab);
	}

	@Override
	public void updateCabCity(String cabId, String cityName) {
		Cab cab = cabsMap.get(cabId);
		cab.setCity(cityRepository.getCity("cityName"));
	}

	@Override
	public void updateCabState(String cabId, CabState cabState) throws CabNotFoundException {
		Cab cab = cabsMap.get(cabId);
		cab.setCabState(cabState);
	}

	@Override
	public Optional<Cab> getCabToBook(City from, CabType type) {

		Optional<Cab> cab = cabsMap.values().stream()
				.filter(c -> c.getCabType() == type)
				.filter(c -> c.getCity().getName().equals(from.getName()))
				.filter(c -> c.getCabState() == CabState.IDLE)
				.sorted(Comparator.comparing(Cab::getLastTrip))
				.findFirst();

		return cab;

	}

}
