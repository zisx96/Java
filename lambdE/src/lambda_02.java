
// function interface -> interface with only one method

interface A{
	
	void show();
}
@FunctionalInterface
interface Person {
	
	//void getData();
	// String toString(); it is predefined so it works in interface.
	// default method also works.
	
	int add(int x, int y);
}

class Top implements Person{
	
	public int add(int x, int y) {
		
		return x+y;
	}
}

//abstract class A {
//	
//	abstract void show();
//}
//
//class R extends A{
//	
//	public void show() {
//		
//		System.out.println("In show");
//	}
//}

public class lambda_02 {

	public static void main(String[] args) {
		
//		A obj = new A() {	// works for abstract as well as for interface for implementation during object creation
//			
//			public void show() {
//				
//				System.out.println("new in show");
//			}
//		};
		
		A obj = () -> System.out.println("In show");	// only called when it is an function interface
		
		obj.show();
		
		//	Person p = () -> System.out.println("new data");
		//	p.getData();
		
		Person t = (x , y) ->  x + y;
			
		
		int result = t.add(4,6);
		System.out.println(result);
	}

}
