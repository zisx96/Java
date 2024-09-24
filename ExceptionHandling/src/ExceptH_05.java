import java.util.Scanner;

class Alpha2{
	
public void calc() throws ArithmeticException  {
		
		System.out.println("Alpha Connection Established");
		
		try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("kindly enter the numerator for division");
			
			int n = scan.nextInt();
			
			System.out.println("kindly enter the denominator for division");
			
			int d = scan.nextInt();
			
			int res = n/d;
			
			System.out.println("result is: " + res);
			
			}
			
			catch(ArithmeticException e) {
			
				System.out.println("handled in alpha");
				throw e;	// like return statement alpha connection do not get executed
			}
		
		finally {
	
			System.out.println("Alpha Connection Terminated");
		}
	}
}  

public class ExceptH_05 {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("main connection established");
				
			Alpha2 a2 = new Alpha2();
			a2.calc();
			
			}
			
			catch(ArithmeticException e) {
				
				System.out.println("exception caught in main");
			}
			
			System.out.println("main connection terminated");


	}

}
