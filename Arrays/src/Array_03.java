
// 2-D Array irregular array or jagged array.

import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {
		
		int[][] mark = new int[3][];
		
		mark[0] = new int[4];
		mark[1] = new int[3];
		mark[2] = new int[2];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i =0;i<mark.length;i++) {
			
			for(int j =0;j<mark[i].length; j++) {
				
				System.out.println("enter marks of class " + i + " student " + j);
				mark[i][j] = scan.nextInt();
			}	
		}
		
		for(int i =0;i<mark.length;i++) {
		
		for(int j =0;j<mark[i].length; j++) {
			
			System.out.print(mark[i][j] + " ");
			}
		
		System.out.println();
		
		}

	}

}
