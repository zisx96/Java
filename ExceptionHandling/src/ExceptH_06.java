
class Gamma {
	
	public int disp() {
		
		try {
			
			System.out.println("disp method do gamma");
			return 10;
		}
		
		finally {
			System.out.println("finally block of gamma");
			return 44;
		}
	}
}
 
public class ExceptH_06 {

	public static void main(String[] args) {
		
		Gamma g = new Gamma();
		System.out.println(g.disp());
	}

}
