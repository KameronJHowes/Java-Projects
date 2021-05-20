package com.qa.garage;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args)
	{
		Vehicle car = new Car(1, 1, "s");
		
		Vehicle motorcycle = new MotorCycle(1, 1, "s");
		
		Vehicle boat = new Boat(1,1,"s");
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(); 
		{
			for(Vehicle vehicle : vehicles) 
			{
				vehicles.add(motorcycle);
				vehicles.add(car);
				vehicles.add(boat);
			}
		}
		System.out.println(vehicles);
	}
}
