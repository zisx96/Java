
enum Week{
	
	MON, TUE, WED, THU, FRI, SAT, SUN;	// recommended to write in capital
	
}

public class Enums_01 {

	public static void main(String[] args) {
		
		Week week = Week.MON;
		System.out.println(week);
		
		int i = week.THU.ordinal();
		
		System.out.println(i);
		
		Week[] weekAR = Week.values();
		
		for(Week w: weekAR) {
			
			System.out.println(w.ordinal()+ "  -> "+ w);
		}
		
	}

}
