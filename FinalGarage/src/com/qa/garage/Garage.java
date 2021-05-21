package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage 
{
	Vehicle car = new Car(1980, 4, "S");
	
	Vehicle motorcycle = new MotorCycle(1990, 2, "S");
	
	Vehicle boat = new Boat(2000,0,"L");
	
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(); 
	{
		for(Vehicle vehicle : vehicles) 
		{
			vehicles.add(motorcycle);
			vehicles.add(car);
			vehicles.add(boat);
		}
	}
	
	
	public void calculateBill(Vehicle v) 
	{ 
		if(v.getVehicleSize() == "S" || v.getType() == "MotorCycle") 
		{
			System.out.println("That'll be 50$");
		}else if (v.getVehicleSize() == "M" || v.getType() == "Car") 
		{
			System.out.println("That'll be 100$");
		}else if (v.getVehicleSize() == "L" || v.getType() == "Boat") 
		{
			System.out.println("That'll be 150$");
		}
	}
	 public void showRepairBills() {
	        int totalBill = 0;
	        for(int i = 0; i < vehicles.size(); i++) {
	            Vehicle e = (Vehicle) vehicles.get(i);
	            int bill = e.calculateBill();
	            String response = "Vehicle: " + e.getYear() + " " + e.getType() + " repair bill is: " + e.calculateBill();
	            totalBill += bill;
	            System.out.println(response);
	        }
	        System.out.println("Total Bill for all vehicles: $" + totalBill);
	    }             
	 public void removeByType(String Type) {
		    if (!this.vehicles.isEmpty()) {
		      List<Vehicle> indexesToRemove = new ArrayList<Vehicle>();
		      for (int i = 0; i < this.vehicles.size(); i++) {
		        Vehicle e = this.vehicles.get(i);
		        if (Type == "car") {
		          if (e instanceof Car) {
		            indexesToRemove.add(e);
		          }
		        }
		        if (Type == "boat") {
		          if (e instanceof Boat) {
		            indexesToRemove.add(e);
		          }
		        }
		        if (Type == "motorcycle") {
		          if (e instanceof MotorCycle) {
		            indexesToRemove.add(e);
		          }
		        }
		       
		        indexesToRemove.forEach(index -> {
		          System.out.println(index);
		          this.vehicles.remove(index);
		        });
		      }
		    } else {
		      System.out.println("empty");
		    }
		  }
	 			public void addVehicle(Vehicle ve) 
	 			{
	 				if(!vehicles.contains(ve)) 
	 				{
	 					vehicles.add(ve);
	 				}
	 			}
	 			public void emptyGarage() 
	 			{
	 				if(!this.vehicles.isEmpty()) 
	 				{
	 					this.vehicles.removeAll(vehicles);
	 				}
	 			}
}	



	

