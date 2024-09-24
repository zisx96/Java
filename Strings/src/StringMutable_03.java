
public class StringMutable_03 {

	public static void main(String[] args) {
		
		StringBuilder s1 = new StringBuilder("Sachin");
		
		StringBuilder s2 = new StringBuilder("Sachin");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
	}

}
