package Threads;

public class Jointkeyword {
	private static int count = 0;
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i=0; i<=1000; i++) {
					count++;
					
				}
				
			}
				
			
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i =0; i>= 100; i++) {
					count++;
				}
			}
		});
		
		
		t1.start();
		t2.start();
//		System.out.println("value :"+ count);
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		t2.join();
		System.out.println("value :-" + count);
	}
	
}
