
interface Omega<O>{
	
	
}

class Alpha<A> implements Omega<String>{
	
	private A ref;
	
	public Alpha(A ref) {
		
		this.ref = ref;
	}
	
	public void disp() {
		
		System.out.println("The type of A is : " + ref.getClass().getName());
	}
	
	public A getRef() {
		
		return ref;
	}
}

public class generic_02 {

	public static void main(String[] args) {
		
		Alpha<Integer> a = new Alpha<>(44);
		
		a.disp();
		System.out.println(a.getRef());
		
		
//		Alpha<Integer> a = new Alpha<>("java"); // compile error
		
		Alpha<String> s = new Alpha<>("hello");
		s.disp();
		System.out.println(s.getRef());
	}

}
