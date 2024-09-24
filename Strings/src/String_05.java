
public class String_05 {

	public static void main(String[] args) {
		
		//StringBuffer s = "yash";	// compile error
		
//		StringBuffer s1 = new StringBuffer("ILoveJava");
		StringBuilder s1 = new StringBuilder("ILoveJava");
		
		System.out.println(s1);
		s1.append(" WhatAboutYou");
		System.out.println(s1);
		s1.append(50.4);
		s1.append(true);
		System.out.println(s1);
	}

}
