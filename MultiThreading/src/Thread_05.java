import java.util.Scanner;

class Alpha3 extends Thread{
	
	@Override
	public void run() {
		
		String threadName = Thread.currentThread().getName();
		
		if(threadName.equals("BANK")){
			
			Banking();
		}
		else if(threadName.equals("PRINT")){
			
			PrintingA();
		}
		else {
			
			focus();
		}
	}
	
	public void Banking() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Banking Activity started");
		
		System.out.println("Enter the user number");
		int un = sc.nextInt();
		
		System.out.println("Enter the user password");
		int p = sc.nextInt();
		
		System.out.println("Collect your cash");
		System.out.println("Banking Activity Terinated");
	}
	
	public void PrintingA() {
		
		System.out.println("Printing Activity Started");
		
		for(int i=0;i<=4; i++) {
			
			System.out.println("**");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("Printing Activity Terminated");
		
	}
	
	public void focus()  {
		
		System.out.println("Printing Important Message Started");
		
		for(int i=0;i<=4; i++) {
			
			System.out.println("Focus is the key to master any skills.");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("Printing Important Message Terminated");
	}
}

public class Thread_05 {

	public static void main(String[] args) {
		
		System.out.println("Application Started.....");
		
		Alpha3 a = new Alpha3();	
		
		Thread thread1 = new Thread(a);
		Thread thread2 = new Thread(a);
		Thread thread3 = new Thread(a);		
		
		thread1.setName("BANK");
		thread3.setName("PRINT");
		thread3.setName("FOCUS");
		
		
		thread1.start();
		thread2.start();
		thread3.start();		
		
		System.out.println("Application Terminated.....");

	}

}
