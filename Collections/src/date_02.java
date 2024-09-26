import java.time.LocalDate;
import java.time.LocalDateTime;

public class date_02 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		
		int dayOfMonth = date.getDayOfMonth();
		
		System.out.println(dayOfMonth);
		
		int month = date.getMonthValue();
		
		int year = date.getYear();
		
		System.out.println(dayOfMonth +" / "+ month +" / "+ year );
	
		LocalDate dob = LocalDate.of(1985, 9, 8);
		
		System.out.println(dob);
	
		LocalDateTime td = LocalDateTime.now();
		
		System.out.println(td);
		
		
	}

}
