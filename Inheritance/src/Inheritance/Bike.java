package Inheritance;

public class Bike extends Vehicle {
	public String handle;
	
	
	
	public Bike(String engine, int wheels, int seats, int fuelTank, String lights, String handle) {
		super(engine, wheels, seats, fuelTank, lights);
		this.handle = handle;
	}

	public Bike(String string, int i, int j, int k, String string2) {
		handle = "short";
		
		}

	public String getHandle() {
		return handle;
	}
	
	public String run() {
		return "Bike is Running";
		
	}

	@Override
	public String toString() {
		return "Bike [handle=" + handle + "]" + super.toString(); 
		
	}
	

}
