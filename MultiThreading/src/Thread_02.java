import java.util.Scanner;

class Alpha{
	
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

class Beta{
	
	public void PriningA() throws InterruptedException {
		
		System.out.println("Printing Activity Started");
		
		for(int i=0;i<=4; i++) {
			
			System.out.println("**");
			Thread.sleep(4000);
		}
		
		System.out.println("Printing Activity Terminated");
		
	}
	
}

class Gamma{
	
	public void ImpoP() throws InterruptedException {
		
		System.out.println("Printing Important Message Started");
		
		for(int i=0;i<=4; i++) {
			
			System.out.println("Focus is the key to master any skills.");
			Thread.sleep(4000);
		}
		
		System.out.println("Printing Important Message Terminated");
	}
	
}

public class Thread_02 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("Application Started.....");
		
		Alpha a = new Alpha();
		Beta b = new Beta();
		Gamma g = new Gamma();
		
		a.Banking();
		b.PriningA();
		g.ImpoP();
		
		
		System.out.println("Application Terminated.....");
		
		
	}

}
