
// Cyclic class is not allowed in Java.


class Parent extends Child{
	
	void disp() {
		
		System.out.println("Parent Class method");
	}
}

class Child extends Parent{
	
	
}

public class in_o4 {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.disp();

	}

}
