import java.util.Scanner;

class Alpha{
	
	public void calc() {
		
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
			
				System.out.println("pealse enter non zero");
			}
			
			catch(Exception e){
				
				System.out.println("error occured");
			}
	
		
		System.out.println("Alpha Connection Terminated");
	}
}

class Beta{
	
	public void disp() {
		System.out.println("Beta connection established");
		
		Alpha a = new Alpha();
		a.calc();
		
		System.out.println("Beta connection terminated");
	}
	
}

public class ExceptH_03 {

	public static void main(String[] args) {
		
		System.out.println("main connection established");
		
		Beta b = new Beta();
		b.disp();
		
		System.out.println("main connection terminated");
	}

}
