package com.creational.designpattern.factory;

public class TravelAgent {
	
	public void getTravelDetails(String type){
		Travel travel = TravelFactory.travelType(type);
		System.out.println("Travel Carrier name = "+travel.carrierName());
		System.out.println("Travel Duration = "+travel.duration()+" hrs.");
		System.out.println("Travel Charges = Rs."+travel.fare());
	}

}
