package com.cmp.model;

import java.util.Date;

public class Trip {
	
	private int id;
	private Customer rider;
	private Cab cab;
	private Date tripDate;
	private City from;
	private City to;
	
	private Double fare;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public City getFrom() {
		return from;
	}
	public void setFrom(City from) {
		this.from = from;
	}
	public City getTo() {
		return to;
	}
	public void setTo(City to) {
		this.to = to;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	public Customer getRider() {
		return rider;
	}
	public void setRider(Customer rider) {
		this.rider = rider;
	}
	public Cab getCab() {
		return cab;
	}
	public void setCab(Cab cab) {
		this.cab = cab;
	}
	public Date getTripDate() {
		return tripDate;
	}
	public void setTripDate(Date tripDate) {
		this.tripDate = tripDate;
	}
	
	

}
