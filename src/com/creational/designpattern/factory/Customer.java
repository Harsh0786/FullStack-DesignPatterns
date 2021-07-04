package com.creational.designpattern.factory;

public class Customer {

	public static void main(String[] args) {
       TravelAgent agent1 = new TravelAgent();
       agent1.getTravelDetails("Air");
       System.out.println("---------");
       TravelAgent agent2 = new TravelAgent();
       agent2.getTravelDetails("BUS");
       System.out.println("---------");
       TravelAgent agent3 = new TravelAgent();
       agent3.getTravelDetails("tRain");
	}

}
