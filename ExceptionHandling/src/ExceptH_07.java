class A1{
	
	public void beta() {
		
		alpha();
	}
	
	public void alpha() {
		
		beta();
	}
}


public class ExceptH_07 {

	public static void main(String[] args) {
		
		A1 a = new A1();
		a.beta();
	}

}
