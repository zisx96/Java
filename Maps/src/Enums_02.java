
enum Result{
	
	PASS, FAIL, NR;
	
	// behind the scene of enums
	
	// public static final Result PASS = new Result();
	// public static final Result FAIL = new Result();
	
//	enum Week{
//		
//		MON, TUE;
//	} 
	
	int marks;
	
	Result(){
		
		System.out.println("Constructor of enum");
	}
	
	public void setMarks(int marks) {
		
		this.marks = marks;
	}
	
	public int getMarks() {
		
		return marks;
	}
}

public class Enums_02 {

	public static void main(String[] args) {
		
//		Result result = Result.PASS;
//		result.setMarks(50);
//		System.out.println(result.getMarks());
		
		Result.PASS.setMarks(30);
		System.out.println(Result.PASS.getMarks());
		
		int marks2 = Result.FAIL.getMarks();
		System.out.println(marks2);
		
	}
}
