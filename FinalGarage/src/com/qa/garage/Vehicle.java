package com.qa.garage;

public class Vehicle {
		
		private String type;
		private int year;
		private int numWheels;
		private String vehicleSize;

		public Vehicle(int year, int numWheels, String vehicleSize) {
			this.year = year;
			this.numWheels = numWheels;
			this.vehicleSize = vehicleSize;
		}

		
		
		public String getType() 
		{
			return type;
		}

		
		public int getYear() {
			return year;
		}

		public int getNumWheels() {
			return numWheels;
		}

		public String getVehicleSize() {
			return vehicleSize;
		}

		public int calculateBill() {
			return calculateBill();
		}
	
		
	 }

