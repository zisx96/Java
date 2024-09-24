
//	comapareTo() -> compares the value of string lexographically.

public class String_03 {

	public static void main(String[] args) {
		
//		final String s1 = "yash";
//		
//		s1 = s1 + " java";
		
//		final String s1 = "yash";
//		String s2 = s1+ " java";
//		
//		System.out.println(s2);
		
		String s1 = "SACHIN";

//		String s2 = "SACHIN";
		
		String s2 = "YOGESH";
		
		int res = s1.compareTo(s2);	// compareTo() method called
		
		if(res == 0)
			System.out.println("are equal");
		else
			System.out.println("not equal");
	}

}
