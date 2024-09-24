
// A static method can be inherited but it cannot be overridden.

// whenever we try to override static method in child class it will hide the parent class
// static method it will behave like a specialized method of the child class (overriding would not occur here).
// We cannot override the static method in child class.

class Demo4 {
	
	static int a;
	
	public static void disp() {
		
		a = 10;
		
		System.out.println(a+ " parent class display");
	}
}

class Demo5 extends Demo4{
	
	public static void disp() { // method hiding
		
		a = 20;
		System.out.println(a + " child class display");
	}
}

public class in_06 {

	public static void main(String[] args) {
		
		Demo4 d = new Demo5();
		d.disp();
		
		// Demo4.disp();
		
//		Demo5.disp();
		
		Demo5 d2 = new Demo5();
		d2.disp();
	}

}
