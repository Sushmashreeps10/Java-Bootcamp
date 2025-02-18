package clasi;

public class Caluculator {

	public static void main(String[] args) {
		// Math operator
		int x, y, ans;
		x = 1;
		y = 2;
		ans = x * y;
		int aans = x + y;
		double ans1 = x % y;
		float ans2 = x / y;
		
		System.out.println("Answer is = " + ans);
		System.out.println("Answer is = " + aans);
		System.out.println("Answer is = " + ans1);
		System.out.println("Answer is = " + ans2);
		
//		incrementation
		
		int x1 = 10;
		x1 *= 5;
		
//		x++;
		System.out.println(x1++);
		System.out.println(x1);
		
		System.out.println(x1);
		
		
		
//		conditional statements
		int s = 10;
		
		if (s == 100) {
			System.out.println("yes s = 10");
		} else {
			System.out.println("no s != 10");
		}
		
//		logical opertaor
		
		int sub1 = 99;
		int sub2 = 100;
//		(and == &&) , (or == ||) 
		if ((sub1 >= 35 ) && (sub2 >= 35)) {
			System.out.println("The condition is true");
			System.out.println("the is passed");
		} else {
			System.out.println("The condition is false");
		}
		
//		switch statements
		int score1 = 190;
		
		switch (score1) {
		case 90:
			System.out.println("very good");
			break;
		case 60:
			System.out.println("good");
			break;
		case 40:
			System.out.println("average");
			break;
		case 20:
			System.out.println("need to improve");
			break;
		default:
			System.out.println("The grades are not define");
			break;
			
		}
		
		int w = 10;
		
		while (w < 10) {

			w++;
			System.out.println(w);
			w--;
			System.out.println(w);
			break;
			
		}
		
		int d = 10;
		
		do {
			System.out.println(d);
			d++;
			System.out.println(d);
			break;
		}while (d == 10);
		

	}

}
