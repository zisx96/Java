import java.util.Scanner;

class Alpha1{
	
	public void calc() { //	throws ArithmeticException {	// ducking the exception not handling the exception
		
		System.out.println("Alpha Connection Established");
			
		Scanner scan = new Scanner(System.in);
			
		System.out.println("kindly enter the numerator for division");
			
		int n = scan.nextInt();
			
		System.out.println("kindly enter the denominator for division");
			
		int d = scan.nextInt();
			
		int res = n/d;
			
		System.out.println("result is: " + res);
		
		System.out.println("error occured");
			
		System.out.println("Alpha Connection Terminated");
	}
}


public class ExceptH_04 {

	public static void main(String[] args) {
		
		try {
		
		System.out.println("main connection established");
			
		Alpha1 a1 = new Alpha1();
		a1.calc();
		
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("non zero denominator");
		}
		
		System.out.println("main connection terminated");

 	}

}
