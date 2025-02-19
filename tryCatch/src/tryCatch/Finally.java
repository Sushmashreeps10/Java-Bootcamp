package tryCatch;

public class Finally {
	
	public static int funInt() {
		int a = 1000;
		try {
			a = a/00;
			return a;
			
		 } catch (ArithmeticException e) {
			 System.out.println(e);
			 System.out.println("this is catch method");
			 return a;
			 
		 } finally {
			 a = 5000;
			System.out.println("This is finally");
			return a;
		}
	 }


      public static void main (String[] args) {
    	  System.out.println(funInt());
      }
}
