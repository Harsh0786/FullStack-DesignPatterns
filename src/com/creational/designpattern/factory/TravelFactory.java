package com.creational.designpattern.factory;

public class TravelFactory {
	
	public static Travel travelType(String type){
		Travel travel=null;
		if(type.equalsIgnoreCase("Train")){
			travel = new TrainTravel();
		}else if(type.equalsIgnoreCase("Bus")){
			travel = new BusTravel();
		}else if(type.equalsIgnoreCase("Air")){
			travel = new AirTravel();
		}
		return travel;
	}
	

}
