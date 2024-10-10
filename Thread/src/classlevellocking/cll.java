package classlevellocking;

public class cll {

	public static void main(String[] args) {
		
		
		ICICBank bank1 = new ICICBank();
		
		ICICBank bank2 = new ICICBank();
		
		Atm a = new Atm();
		a.setName("ATM Thread");
		
		Googlepay gp = new Googlepay();
		gp.setName("Google Pay Thread");
		
		PhonePe pe = new PhonePe();
		pe.setName("PhonePe Thread");
		
		a.start();
		gp.start();
		pe.start();
		
	}

}
