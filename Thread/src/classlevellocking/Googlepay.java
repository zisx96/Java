package classlevellocking;

public class Googlepay extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("deposited money");
		ICICBank.deposit(4000);
	}
}
