package Inheritance;

public class Vehicle {
	
	public String engine;
	public int wheels;
	public int seats;
	public int fuelTank;
	public String lights;
	
	public Vehicle() {
		engine = "petrol";
		wheels = 2;
		seats = 10;
		fuelTank = 20;
		lights = "LED";
		
	}



	public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights) {
		super();
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.lights = lights;
	}

	public String getEngine() {
		return engine;
	}


	public int getWheels() {
		return wheels;
	}



	public int getSeats() {
		return seats;
	}


	public int getFuelTank() {
		return fuelTank;
	}


	public String getLights() {
		return lights;
	}
	
	
	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + ", wheels=" + wheels + ", seats=" + seats + ", fuelTank=" + fuelTank
				+ ", lights=" + lights + "]";
	}
	

}
