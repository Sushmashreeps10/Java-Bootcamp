package Inheritance;

public class Class1 {
	
	public static void main(String[] args) {
		Bike bike = new Bike("petrol",2,10,20,"LED");
		bike.handle = "short";
		
//		System.out.println(bike.engine +\n +bike.fuelTank + bike.lights+ bike.handle + bike.seats + bike.wheels);
		System.out.println(bike.run());
		System.out.println(bike);
		

	}

}
