package com.cmp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cmp.enums.CabState;
import com.cmp.enums.CabType;

public class Cab {

	private String id;
	private Driver driver;
	private City city;
	private Date lastTrip;
	private CabState cabState;
	private CabType cabType;
	private List<Trip> trips;

	public Cab(String id, CabType cabType, City city) {

		this.id = id;
		this.cabType = cabType;
		this.cabState = CabState.IDLE;
		this.city = city;
		this.trips = new ArrayList<>();

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Date getLastTrip() {
		return lastTrip;
	}

	public void setLastTrip(Date lastTrip) {
		this.lastTrip = lastTrip;
	}

	public CabState getCabState() {
		return cabState;
	}

	public void setCabState(CabState cabState) {
		this.cabState = cabState;
	}

	public CabType getCabType() {
		return cabType;
	}

	public void setCabType(CabType cabType) {
		this.cabType = cabType;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

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
