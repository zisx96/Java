
//	Notes

// Through interface we can use 100% abstraction.

// interface can be used to specify out requirement which to be implemented.

// It helps to achieve standardization.

// All the method in an interface are public and abstract whether we specify or not.

// It is compulsory from implementing class to override all methods on an interface if implementing class is not overriding
//	all methods of an interface then it must be declared as abstract.

// One interface can have multiple classes.

// We can create reference of an interface to achieve polymorphism.

// Interface all methods are public and abstract.


interface Calc1 {	// all method inside interface are abstract.
	
	void add(int a, int b); // public abstract void add(int a, int b);
	void sub(int a, int b);
	
}

interface Calc2{
	
	int mul(int a, int b);
	int div(int a, int b);
}

class Calculator{
	
	public void disp() {
		
		System.out.println("calculator class");
	}
}

class MyCalc1 extends Calculator implements Calc1,Calc2 {
	
	public void add(int a, int b) {
		
		int res = a + b;
		System.out.println("Res is : " + res);
	}
	
	public void sub(int a, int b) {
		
		int res = a - b;
		System.out.println("Res is : " + res);
	}
	
	public int mul(int a, int b) {
		
		int res = a * b;
		return res;
	
	}
	
	public int div(int a, int b) {
		
		int res = a/ b;
		return res;
	}
}

class MyCalc2 implements Calc1, Calc2 {
	
	public void add(int a, int b) {
		
		int n1 = a;
		int n2 = b;
		int res = n1 + n2;
		System.out.println("Res is : " + res);
	}
	
	public void sub(int a, int b) {
		
		int res = a - b;
		System.out.println("Res is : " + res);
	}
	
	public int mul(int a, int b) {
		
		int res = a * b;
		return res;
	
	}
	
	public int div(int a, int b) {
		
		int res = a/ b;
		return res;
	}
}

class Algebra {
	
	public void cal(Calc1 c, int a, int b) {
		
		c.add(a, b);
		c.sub(a, b);
	}
}

public class interface_01 {

	public static void main(String[] args) {
		
//		Calc cal1= new MyCalc1();
//		cal1.add(4, 10);
//		cal1.sub(6, 2);
//		
//		Calc cal2 = new MyCalc2();
//		cal2.add(5, 4);
//		cal2.sub(5, 6);
		
//		MyCalc1 cal1 = new MyCalc1();
//		MyCalc2 cal2 = new MyCalc2();
//		
//		Algebra a = new Algebra();
//		a.cal(cal1, 10 , 20);
//		a.cal(cal2, 50, 10);
		
	//	Calc c = new Calc() // cannot create object of interface but however we can create reference
		
		MyCalc1 cal1 = new MyCalc1();
		cal1.add(5, 6);
		cal1.sub(10, 6);
		System.out.println(cal1.mul(5, 6));
		System.out.println(cal1.div(6, 2));
	}
	

}
