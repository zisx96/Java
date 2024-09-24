
// Arrays -> Linear data structure , continues memory allocation, index based memory allocation.

// Homo-genous data is stored in arrays ( eg- if Int all data are of Int type).

import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {
		
		int[] marks = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<=marks.length;i++) {
			
			marks[i] = scan.nextInt();
		}
		
		System.out.println("marks are: ");
		
		for(int i=0;i<=marks.length;i++) {
			
			System.out.print(marks[i] + " ");;
		}
	}

}
