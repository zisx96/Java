package objectlevellocking;

public class PhonePe extends Thread {
	
	private ICICBank bank;
	
	public PhonePe(ICICBank bank) {
		
		this.bank = bank;
	}
	
	@Override
	public void run() {
		
		System.out.println("Check Balance");
		bank.checkBalance();
	}
}
