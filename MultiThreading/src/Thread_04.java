import java.util.Scanner;

class Alpha2 extends Thread{
	
	@Override
	public void run() {
		
		Banking();
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
}

class Beta2 extends Thread{
	
	@Override
	public void run() {
		
		try {
			PrintingA();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void PrintingA() throws InterruptedException {
		
		System.out.println("Printing Activity Started");
		
		for(int i=0;i<=4; i++) {
			
			System.out.println("**");
			Thread.sleep(4000);
		}
		
		System.out.println("Printing Activity Terminated");
		
	}
	
}

class Gamma2 extends Thread{
	
	@Override
	public void run() {
		
		try {
			focus();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void focus() throws InterruptedException {
		
		System.out.println("Printing Important Message Started");
		
		for(int i=0;i<=4; i++) {
			
			System.out.println("Focus is the key to master any skills.");
			Thread.sleep(4000);
		}
		
		System.out.println("Printing Important Message Terminated");
	}
	
}
public class Thread_04 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Application Started.....");
		
		Alpha2 a = new Alpha2();
		Beta2 b = new Beta2();
		Gamma2 g = new Gamma2();
		
		Thread thread1 = new Thread(a);
		Thread thread2 = new Thread(b);
		Thread thread3 = new Thread(g);
		
		System.out.println(thread1.isAlive());	// false
		System.out.println(thread2.isAlive());	// false
		System.out.println(thread3.isAlive());	// false
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		a.join();
		b.join();
		g.join();
		
		System.out.println(thread1.isAlive());	// true
		System.out.println(thread2.isAlive());	// true
		System.out.println(thread3.isAlive());	// true
		
		
//		a.Banking();
//		b.PrintingA();
//		g.focus();
		
		
		System.out.println("Application Terminated.....");
		
	}
}
