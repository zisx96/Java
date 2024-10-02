// deadlock state 
// cyclic dependency of resources.

class Library implements Runnable {
	
	String res1 = new String("Java");
	String res2 = new String("DSA");
	String res3 = new String("SpringBoot");
	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		
		if(name.equals("Student1")) {
			
			try {
				
				System.out.println("Student 1 got into library");
				Thread.sleep(3000);
				synchronized(res1) {
					
					System.out.println("Student 1 has acquired "+ res1);
					Thread.sleep(4000);
					synchronized(res2) {
						
						System.out.println("Student 1 has acquired "+ res2);
						Thread.sleep(4000);
						
						synchronized(res3) {
							
							System.out.println("Student 1 has acquired "+ res3);
							Thread.sleep(4000);
						}
					}
				}
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
		}
		else {
			
			try {
				
				System.out.println("Student 2 got into library");
				Thread.sleep(3000);
				synchronized(res3) {
					
					System.out.println("Student 2 has acquired "+ res3);
					Thread.sleep(4000);
					synchronized(res2) {
						
						System.out.println("Student 2 has acquired "+ res2);
						Thread.sleep(4000);
						
						synchronized(res1) {
							
							System.out.println("Student 2 has acquired "+ res1);
							Thread.sleep(4000);
						}
					}
				}
				
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
		}
	}
	
	
	
}

public class Thread_08 {

	public static void main(String[] args) {
		
		Library l = new Library();
		
		Thread thread1 = new Thread(l);
		Thread thread2 = new Thread(l);
		
		thread1.setName("Student1");
		thread2.setName("Student2");
		
		thread1.start();
		thread2.start();

	}

}
