package Moblie;

public class Pixel {
	public static void main(String[] args) {
	 samsung phone = new samsung();
	 int p = phone.phone1();
	 System.out.println(phone.phone1());
	 System.out.println(p);
	 
	 
	 Iphone phoneB = new Iphone();
	 int p2 = phoneB.phone2();
	 System.out.println(p2);
	 
	 System.out.println(SpaceinGB());
	 System.out.println(phone.SpaceinGB());
	}

	private static char SpaceinGB() {
		// TODO Auto-generated method stub
		return 'a';
	}

}
