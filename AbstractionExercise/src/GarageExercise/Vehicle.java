package GarageExercise;

public class Vehicle {
	private int year;
	private int numWheels;
	private String vehicleSize;

	public Vehicle(int year, int numWheels, String vehicleSize) {
		this.year = year;
		this.numWheels = numWheels;
		this.vehicleSize = vehicleSize;
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
 }
