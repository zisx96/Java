
class Parent {
	
	int i = 10;
	
	void disp() {
		
		System.out.println("Disp of parent");
	}
}

class Child extends Parent{
	
	int i = 100;
	
	void alpha() {
		
		System.out.println("alpha");
		System.out.println(i);
		System.out.println(super.i);
		super.disp();
	}
	
	void disp() {
		
		System.out.println("Disp of child");
	}
}

public class ConsIn_04 {

	public static void main(String[] args) {
		
		new Child().alpha();
		new Child().disp();
	}

}
