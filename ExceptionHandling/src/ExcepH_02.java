import java.util.Scanner;

public class ExcepH_02 {

	public static void main(String[] args) {
				
		System.out.println("Connection Established");
		Scanner scan = new Scanner(System.in);		
		
		try {		
				
		System.out.println("kindly enter the numerator for division");
				
		int n = scan.nextInt();
				
		System.out.println("kindly enter the denominator for division");
				
		int d = scan.nextInt();
				
		int res = n/d;
				
		System.out.println("result is: " + res);
				
		System.out.println("kindly enter size of the array ");
		
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("enter the elements in the array");
		
		int ele = scan.nextInt();
		
		System.out.println("kindly enter position at which element has to be added");
		int index = scan.nextInt();
		
		arr[index] = ele;
		
		System.out.println("Data entered in a array is " + arr[index]);
		
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("pealse enter non zero");
		}
		
		catch(NegativeArraySizeException e) {
			
			System.out.println("please enter positive size of array");
		}
				
		catch(ArrayIndexOutOfBoundsException e){
					
			System.out.println("enter element within array limit");
		}
		
		catch(Exception e) {	// parent Exception always at last if at top of any other exception it will 
								// handle all the exception instead of particular exception.
			
			System.out.println("some error");
		}
		

		System.out.println("Connection Terminated");
	}
}

	


