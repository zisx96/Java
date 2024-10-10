package classlevellocking;

public class ICICBank {
		
	static int accountBal = 4000;
	
//	public ICICBank(int accountBal) {
//		
//		this.accountBal = accountBal;
//
//	}
	
	synchronized static public void withdraw(int withdraw) {
		
		accountBal = accountBal - withdraw;
	}
	
	synchronized static public void deposit(int deposit) {
		
		accountBal = accountBal + deposit;
	}
	
	synchronized static public void checkBalance() {
		
		System.out.println("The balance in the account is: " + accountBal );
	}

}
