
interface Era{
	
	void show();
	
	default void disp() {
		
		System.out.println("New era is here");
	}
}

class E1 implements Era {
	
	public void show() {
		
		System.out.println("Hello new era");
	}
	
	public void show() {
		
		System.out.println(" New Hello new era"); // overridden
	}
}

public class interface_03 {

	public static void main(String[] args) {
		
		E1 e = new E1();
		e.show();
		e.disp();
	}

}
