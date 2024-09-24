
public class String_04 {

	public static void main(String[] args) {
		
		String s1 = "i love java";
		
		String[] str = s1.split(" ");
		
		for (String s : str) {
			
			System.out.print(s);
		}
		
		System.out.println();
		
		String str1 = "   hello world  ";
		
		System.out.println(str1);
		System.out.println(str1.trim());	// trims leading space and trailing spaces
		
		System.out.println(str1.stripTrailing());
		
		System.out.println(str1.stripLeading());
	}

}
