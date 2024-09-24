
// An interface cannot implement another interface.
// An interface can extends another interface.
// We cannot have constructor in an interface.

interface Demo1{
	
	void disp();
	void show();
	int a = 0;	// public static final variable.
	
	void displayInt();
}

interface Demo2 extends Demo1 {
	
}

class Alpha implements Demo2{
	
	public void disp() {
		
		System.out.println("focus is key");
	}
	
	public void show() {
		
		System.out.println("key");
	}
	
	public void displayInt() {
		
		System.out.println(a);
	}
}

public class interface_02 {

	public static void main(String[] args) {
		
		Demo1 d1 = new Alpha();
		d1.disp();
		d1.displayInt();
		
		Demo2 d2 = new Alpha();
		d2.disp();
		d2.show();
	}

}
