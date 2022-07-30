package com.cmp.services.impl;

import java.util.Date;
import java.util.Optional;

import com.cmp.enums.CabState;
import com.cmp.enums.CabType;
import com.cmp.exceptions.CabNotAvailableException;
import com.cmp.exceptions.CityNotFoundException;
import com.cmp.model.Cab;
import com.cmp.model.City;
import com.cmp.model.Customer;
import com.cmp.model.Trip;
import com.cmp.repository.ICabRepository;
import com.cmp.repository.ICityRepository;
import com.cmp.repository.ICustomerRepository;
import com.cmp.services.ICabBookingService;

public class CabBookingService implements ICabBookingService {

	private ICustomerRepository customerRepository;
	private ICabRepository cabRepository;
	private ICityRepository cityRepository;

	public CabBookingService(ICustomerRepository customerRepository, ICabRepository cabRepository,
			ICityRepository cityRepository) {
		this.customerRepository = customerRepository;
		this.cabRepository = cabRepository;
		this.cityRepository = cityRepository;
	}

	@Override
	public Cab bookCab(String customerId, CabType type, String from, String to) throws CabNotAvailableException, CityNotFoundException {
		Trip trip = new Trip();

		Customer customer = customerRepository.getCustomer(customerId);

		City fromCity = cityRepository.getCity(from);
		if(fromCity == null) {
			throw new CityNotFoundException("We do not support from city " + from);
		}
		City toCity = cityRepository.getCity(to);
		if(toCity == null) {
			throw new CityNotFoundException("We do not support to city " + to);
		}

		Optional<Cab> cab = cabRepository.getCabToBook(fromCity, type);
		if (!cab.isPresent()) {
			throw new CabNotAvailableException("Cab not available at this time, please try again later");
		}

		Date bookedDate = new Date();

		Cab bookedCab = cab.get();
		bookedCab.setCabState(CabState.ON_TRIP);
		bookedCab.setCity(toCity);
		bookedCab.setLastTrip(bookedDate);

		updateTrip(trip, customer, fromCity, toCity, bookedDate, bookedCab);

		bookedCab.addTrip(trip);

		customer.addTrip(trip);

		return bookedCab;
	}

	private void updateTrip(Trip trip, Customer customer, City fromCity, City toCity, Date bookedDate, Cab bookedCab) {
		trip.setCab(bookedCab);
		trip.setFare(12.0);
		trip.setFrom(fromCity);
		trip.setTo(toCity);
		trip.setRider(customer);
		trip.setTripDate(bookedDate);
	}

}
