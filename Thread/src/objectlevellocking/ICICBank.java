package objectlevellocking;

public class ICICBank {
		
	int accountBal;
	
	public ICICBank(int accountBal) {
		
		this.accountBal = accountBal;

	}
	
	synchronized public void withdraw(int withdraw) {
		
		accountBal = accountBal - withdraw;
	}
	
	synchronized public void deposit(int deposit) {
		
		accountBal = accountBal + deposit;
	}
	
	synchronized public void checkBalance() {
		
		System.out.println("The balance in the account is: " + accountBal );
	}

}
