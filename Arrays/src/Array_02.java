// 2-D Array regular array.

import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {
		
		int[][] marks = new int[3][4];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i =0;i<marks.length;i++) {
			
			for(int j =0;j<marks[i].length; j++) {
				
				System.out.println("enter marks of class " + i + " student " + j);
				marks[i][j] = scan.nextInt();
			}	
		}
		
		for(int i =0;i<marks.length;i++) {
		
		for(int j =0;j<marks[i].length; j++) {
			
			System.out.print(marks[i][j]);
			}
		
		System.out.println();
		
		}
	}
}
