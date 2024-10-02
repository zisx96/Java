class MyCar1 implements Runnable{
	
	@Override 
	public void run() {
		
		try {
			
			System.out.println(Thread.currentThread().getName()+ " has entered the parking lot.");
			Thread.sleep(3000);
			
			synchronized(this) {
				
				System.out.println(Thread.currentThread().getName()+ " has entered the car.");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+ " has started to drive the car.");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+ " has come back and parked the car.");
			}
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}


public class Thread_07 {

	public static void main(String[] args) {
		
		MyCar1 car = new MyCar1();
		
		Thread thread1 = new Thread(car);
		Thread thread2 = new Thread(car);
		Thread thread3 = new Thread(car);
		
		thread1.setName("Aman");
		thread2.setName("Ayush");
		thread3.setName("Sushant");
				
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
