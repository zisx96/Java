package classlevellocking;

public class PhonePe extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("Check Balance");
		ICICBank.checkBalance();
	}
}
