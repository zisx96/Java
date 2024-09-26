//import java.util.Date;

import java.sql.Date;

public class date_01 {

	public static void main(String[] args) {
		
		// Date --> util , sql
		// Java 8 --> joda api --> new data time api --> time package
		
//		Date date = new Date();
//		
//		System.out.println(date);
//		
//		System.out.println(date.getYear());
		
		long timeInMs = 1727317808379L;
		Date date = new Date(timeInMs);
		
		System.out.println(date); // return only date
	}

}
