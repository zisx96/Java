
public class Xpattern {

	public static void main(String[] args) {
		
		int n = 9;
		
		for(int i = 0;i < n; i++) {
	// x pattern	
			
			for(int j= 0; j < n; j++) {
				
				if( i == j || i + j == n-1) {
					System.out.print("*");
				}
				else
					
					System.out.print(" ");
			}
			
		// box x pattern
			
			System.out.print("  ");
			
				for(int j= 0; j < n; j++) {
					
					if( i == j || i + j == n-1 || i == 0 || j == 0 || i == n-1 || j == n-1 ) {
						System.out.print("*");
					}
					else
						
						System.out.print(" ");
				}
				
		// x and double half x pattern
				
			System.out.print("  ");
			
			for(int j= 0; j < n; j++) {
				
				if( i == j || i + j == n-1 || i + j == (n-1)/2 || j-i == (n-1)/2) {
					System.out.print("*");
				}
				else
					
					System.out.print(" ");
			}
		// upper triangle pattern
			
			System.out.print("  ");
			
			for(int j= 0; j < n; j++) {
				
				if( i + j == (n-1)/2 || j-i == (n-1)/2 || i == (n-1)/2) {
					System.out.print("*");
				}
				else
					
					System.out.print(" ");
			}
			
		// lower triangle pattern
			
			System.out.print("  ");
			
			for(int j= 0; j < n; j++) {
				
				if( i-j == (n-1)/2 || i + j == (n-1) + (n-1)/2 || i == (n-1)/2) {
					System.out.print("*");
				}
				else
					
					System.out.print(" ");
			}
			
		// diamond pattern
			
			System.out.print("  ");
			
			for(int j= 0; j < n; j++) {
				
				if( i-j == (n-1)/2 || i + j == (n-1) + (n-1)/2 || i + j == (n-1)/2 || j-i == (n-1)/2 ) {
					System.out.print("*");
				}
				else
					
					System.out.print(" ");
			}
			
		// Y pattern
			
			System.out.print("  ");
			
			for(int j= 0; j < n; j++) {
				
				if( i + j == n-1 || i == j && i < (n-1)/2 ) {
					System.out.print("*");
				}
				else
					
					System.out.print(" ");
			}
			
		// K pattern
			
			System.out.print("  ");
						
			for(int j= 0; j < n; j++) {
							
				if( j == 0 || i + j == (n-1)/2 || i - j == (n-1)/2) {
						System.out.print("*");
				}
				else
								
					System.out.print(" ");
			}
			
		// N pattern
			
			System.out.print("  ");
			
			for(int j= 0; j < n; j++) {
							
				if( j == 0 || i == j || j == n-1) {
						System.out.print("*");
				}
				else
								
					System.out.print(" ");
			}
			
		// Z pattern
			
			System.out.print("  ");
			
			for(int j= 0; j < n; j++) {
							
				if( i == 0 || i+j == n-1 || i == n-1) {
						System.out.print("*");
				}
				else
								
					System.out.print(" ");
			}

			
			System.out.println();
			
		}
	}
}