package com.lti.model;

public class Flight {
	int flightId;
	String start;
	String destination;	
	
	public Flight(int flightId, String start, String destination) {
		super();
		this.flightId = flightId;
		this.start = start;
		this.destination = destination;
	}


	public int getFlight() {
		return flightId;
	}


	public void setFlight(int flight) {
		this.flightId = flight;
	}


	public String getStart() {
		return start;
	}


	public void setStart(String start) {
		this.start = start;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}

}
