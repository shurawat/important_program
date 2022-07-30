package com.cab.management.model.cab;

import java.util.Date;

import com.cab.management.enums.CabState;
import com.cab.management.enums.CabType;
import com.cab.management.model.City;
import com.cab.management.model.Driver;

public class Cab {

	private String id;
	private Driver driver;
	private City city;
	private Date lastTrip;
	private CabState cabState;
	private Double basePrice = 10.0;

	public Cab(String id, CabType cabType, City city) {

		this.id = id;
		this.cabState = CabState.IDLE;
		this.city = city;

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

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}

}
