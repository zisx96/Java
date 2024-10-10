package objectlevellocking;

public class Atm extends Thread {
	
	private ICICBank bank;
	
	public Atm(ICICBank bank) {
		
		this.bank = bank;
	}
	
	@Override
	public void run() {
		
		System.out.println("withdrawal");
		bank.withdraw(4000);
	}
}
