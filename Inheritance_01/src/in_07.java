
// Final keyword can be applied to class.
// Final class will not participate in inheritance i.e we cannot inherit from final class.
// Final keyword can be applied to method.
// Final method do participate in inheritance i.e can be inherited in child class.
// However we cannot override the final method in child class.
// Final keyword can be applied for a variable
// Final keyword will behave like constant we cannot reassign the value.
// Static variable can also be final.
// Final keyword can be applied to static methods.

// Important NOTE: Final and static method do not get inherited (overridden).

class Panel{
	
	final static int age = 10;
	
	final public static void fly() {
		
		// age = 30; //	cannot override 
		
		System.out.println("parent panel flying");
	}
}

class Panel1 extends Panel{
	
//	public void fly() {
//		
//		System.out.println("parent panel flying");
//	}
}

public class in_07 {

	public static void main(String[] args) {
		
		Panel1 p1 = new Panel1();
		p1.fly();
	}

}
