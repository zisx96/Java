
// 	String is an class type.

//	Immutable Strings 				Mutable String

//	value does not change			value that we change 
//	often.							often.

//									String can be mutable if
//	String Class					used StringBuffer, StringBuilder.


public class String_01 {

	public static void main(String[] args) {
		
//		String str1 = "yash";	//	output true same reference
//		String str2 = "yash";	//	Direct literal
		
//		String str1 = new String("yash");	// output False
//		String str2 = new String("yash");	// new keyword creates new object
		
//		System.out.println(str1 == str2);	// false
		
//		System.out.println(str1.equals(str2));	// true
//		
//		String s1 = "yash";
//		String s2 = new String("yash");
//		
//		System.out.println(s1.equals(s2));	// true
//		System.out.println(s1 == s2);	// false
		
		String s1 = "yogesh";
		String s2 = "Yogesh";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s1 + s2);
		
		String s = "java "+2500 +499+ 200;	//To string anything after it if you concat then it becomes string.
		String z = 200 + 200 +" yash";	// before string merge output: 400 yash
		System.out.println(s);
		System.out.println(z);

	}

}
