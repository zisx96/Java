
public class String_06 {

	public static void main(String[] args) {
		
//		StringBuffer s1 = new StringBuffer();
		StringBuilder s1 = new StringBuilder(); 
		
		System.out.println(s1.capacity());	// initial capacity is 16
		
		s1.append("Java is one of the best language for programming");
		
		
		
		System.out.println(s1.capacity());	// old capacity * 2 + 2 = 1
		
	}

}
