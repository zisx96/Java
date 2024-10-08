import java.util.Scanner;

class InvalidCustomerException extends Exception{	
	
	public InvalidCustomerException(String msg) {
		
		super(msg);
	}
}

class Atm{
	
	private int acc = 255;
	private int pw = 1234;
	 
	int accNo;
	int Password;
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("kindly enter account number");
		
		accNo = sc.nextInt();
		
		System.out.println("Enter your password");
		
		Password = sc.nextInt();
	}
	
	public void verify() throws InvalidCustomerException {
		
		if(acc == accNo && pw == Password) {
			
			System.out.println("proceed to withdraw cash");
		}
		else 
		{
			InvalidCustomerException ice = new InvalidCustomerException("invalid credentials!");
			System.out.println(ice.getMessage());
			throw ice;
			
			//throw new InvalidCustomerException();
		}
	}
}

class Bank {
	
	public void initiate() {
		
		Atm a = new Atm();
		
		try {
		a.input();
		a.verify();
		
		}
		
		catch(InvalidCustomerException ice) {
			
			System.out.println("try again!");
			
			try {
				a.input();
				a.verify();
				
				}
				
				catch(InvalidCustomerException ice2) {
					
					System.out.println("try again!");
					
					try {
						a.input();
						a.verify();
						
						}
						
						catch(InvalidCustomerException ice3) {
							
							System.out.println("invalid user locked");
				}
			}
		}
	}
}

public class ExceptH_08 {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.initiate();
	}

}
