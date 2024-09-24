
public class FillPaattern {

	public static void main(String[] args) {
		
		int n = 9;
		
		for(int i=0;i<n;i++) {
			
		// full triangle
			
			for(int j=0;j<n;j++) {
				
				if( i+j >= (n-1)/2 && i <= (n-1)/2 && j <= (n-1)/2  || j - i <= (n-1)/2 && i <= (n-1)/2 && j >= (n-1)/2  || i == (n-1)/2) {
					
					System.out.print("*");
				}
				else
					
					System.out.print(" ");
			}
			
		// right triangle
			
			System.out.print("  ");
			
			for(int j=0;j<n;j++) {
				
				if( j == 0 && i <= (n-1)/2  || i == (n-1)/2 && j< (n-1)/2 || i >= j && j <= (n-1)/2 && i <= (n-1)/2  ) {
					
					System.out.print("*");
				}
				else
					
					System.out.print(" ");
			}
			
			System.out.println();
		}

	}

}
