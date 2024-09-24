
//	String class methods

public class String_02 {

	public static void main(String[] args) {
		
		String str = "ILoveJava";
		
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(0, 6));
		System.out.println(str.substring(5));
		
		char ch[] = str.toCharArray();
		
		for (char c : ch ) {
			
			System.out.println(c);
		}
		
		System.out.println(str.charAt(5));
		System.out.println(str.concat(" What about you"));
		System.out.println(str.startsWith("I"));
		System.out.println(str.indexOf("J"));
	}

}
