package com.cmp.model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Account {
	

	public Customer(String id, String firstName, String lastName, String aadharNumber, String mobileNumber) {
		super(id, firstName, lastName, aadharNumber, mobileNumber);
	}

	private List<Trip> trips = new ArrayList<>();

	public List<Trip> getTrips() {
		return trips;
	}

	public void setTrips(List<Trip> trips) {
		this.trips = trips;
	}

	public void addTrip(Trip trip) {
		trips.add(trip);
	}

}
