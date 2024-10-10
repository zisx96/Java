package objectlevellocking;

public class Googlepay extends Thread {
	
	private ICICBank bank;
	
	public Googlepay(ICICBank bank) {
		
		this.bank = bank;
	}
	
	@Override
	public void run() {
		
		System.out.println("deposited money");
		bank.deposit(4000);
	}
}
