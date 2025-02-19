package Threads;


class myclass extends Thread {

	
	public void run() {
		for(int i = 0; i <10; i++) {
			System.out.println(Thread.currentThread().getId() + "value = "+i);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}



public class Demo {

	public static void main(String[] args) {
		myclass class1 = new myclass();
		class1.start();	
		myclass class2 = new myclass();
		class2.start();

	}

}
