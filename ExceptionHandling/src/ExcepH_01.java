
// Exception is something that occurs during runtime.

// if there is no exception handled then it will go to default exception handler.


import java.util.Scanner;

public class ExcepH_01 {

	public static void main(String[] args) {
		
		//	int void = 10; //	CE 
		
		System.out.println("Connection Established");
		
		try {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("kindly enter the numerator for division");
		
		int n = scan.nextInt();
		
		System.out.println("kindly enter the denominator for division");
		
		int d = scan.nextInt();
		
		int res = n/d;
		
		System.out.println("result is: " + res);
		
		}
		
		catch(Exception e){
			
			System.out.println("error occured");
		}
		
		System.out.println("Connection Terminated");
	}

}
