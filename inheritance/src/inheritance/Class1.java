package inheritance;

public class Class1 {
	
	public static void main(String[] args) {
		square obj1 = new square();
		retangle obj2 = new retangle();
		triangle obj3 = new triangle();
		
		System.out.println(obj1.getarea());
		System.out.println(obj2.getarea());
		System.out.println(obj3.getarea());
	}
}
