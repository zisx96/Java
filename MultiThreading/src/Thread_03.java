
import java.util.Scanner;

class Alpha1 extends Thread{
	
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

class Beta1 extends Thread{
	
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

class Gamma1 extends Thread{
	
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

public class Thread_03 {

	public static void main(String[] args) throws InterruptedException  {
		
		System.out.println("Application Started.....");
		
		Alpha1 a = new Alpha1();
		Beta1 b = new Beta1();
		Gamma1 g = new Gamma1();
		
		a.start();
		b.start();
		
		a.join();
		b.join();
		
		g.start();
		g.join();
		
//		a.Banking();
//		b.PrintingA();
//		g.focus();
		
		
		System.out.println("Application Terminated.....");

	}

}
