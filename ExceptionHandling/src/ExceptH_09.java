import java.util.Scanner;

class UnderAgeException extends Exception{
	
	public UnderAgeException(String msg) {
		
		super(msg);
	}
}

class OverAgeException extends Exception{
	
	public OverAgeException(String msg) {
		
		super(msg);
	}
}

class Applicant{
	
	int age ;
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("kindly enter your age");
		age = sc.nextInt();
	}
	
	public void verify() throws UnderAgeException, OverAgeException {
		
		if(age >= 18 && age <= 60) {
			
			System.out.println("proceed with the application!");
		}
		else if(age < 18) {
			
			UnderAgeException ug = new UnderAgeException("you are under 18.");
			System.out.println(ug.getMessage());
			throw ug;
		}
		else {
			
			OverAgeException og = new OverAgeException("you are old now stay home.");
			System.out.println(og.getMessage());
			throw og;
		}
	}
	
}

class RTO{
	
	public void initiate() {
		
		Applicant a = new Applicant();
		
		try {
			a.input();
			a.verify();
		} catch (UnderAgeException | OverAgeException e) {
			
			System.out.println("try again!");
			
			try {
				a.input();
				a.verify();
			} catch (UnderAgeException | OverAgeException ex) {
				
				System.out.println("You are Blocked");
			}
		}
	}
}

public class ExceptH_09 {

	public static void main(String[] args) {
		
		System.out.println("License Aplication");
		
		RTO r = new RTO();
		r.initiate();
	}

}
