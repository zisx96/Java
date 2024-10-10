package classlevellocking;

public class Atm extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("withdrawal");
		ICICBank.withdraw(4000);
	}
}
