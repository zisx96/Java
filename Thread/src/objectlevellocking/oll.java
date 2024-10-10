package objectlevellocking;

public class oll {

	public static void main(String[] args) {
		
		ICICBank bank1 = new ICICBank(4000);
		
		Atm a = new Atm(bank1);
		a.setName("ATM Thread");
		
		Googlepay gp = new Googlepay(bank1);
		gp.setName("Google Pay Thread");
		
		PhonePe pe = new PhonePe(bank1);
		pe.setName("PhonePe Thread");
		
		a.start();
		gp.start();
		pe.start();
		
		
	}

}
