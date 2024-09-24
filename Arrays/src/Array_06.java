import java.util.Arrays;
import java.util.Scanner;

class Test {
	
	String course;
	int courseCost;
	String city;
}

public class Array_06 {

	public static void main(String[] args) {
		
		Test a = new Test();
		
		System.out.println(a);
		
		System.out.println(a.getClass().getName());
		
		int arr[] = new int[4];
		System.out.println(arr);
		System.out.println(arr.getClass().getName());
		
		Test array[] = new Test[2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++ ) {
			
			array[i] = new Test();
			
			System.out.println("Enter the Course");
			array[i].course = sc.next();
			
			System.out.println("Enter the Course Cost");
			array[i].courseCost = sc.nextInt();
			
			System.out.println("Enter the City");
			array[i].city = sc.next();
			
		}
		
		for(int i = 0; i < array.length; i++ ) {
			
			System.out.println("Course: " + array[i].course +
								", Course Cost: " + array[i].courseCost +
								", City: " + array[i].city);
		}
	}

}
