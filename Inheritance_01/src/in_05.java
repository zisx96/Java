// Visibility in java in inherited methods 
// Rules of method overloading

class Plane{
	
	
}

class FighterPlane extends Plane{
	
	public void flying() {
		
		System.out.println("the fighter plane is flying");
	}
}

class T{
	
}

class Animal {
	
	public void eat(String foodType) {
		System.out.println("Animals are required to eat.");
	}
	
	void sleep() {
		
		System.out.println("Animal is sleeping.");
	}
	
	public Plane running() {
		
		System.out.println("Animal is running.");
		Plane p = new Plane();
		return p;
	}
}

class Tiger extends Animal{
	
//	void eat() {	cannot reduce the visibility while overriding inherited methods
//		
//		System.out.println("Tiger hunts and eat.");
//	}
	
	public void eat(String foodType) {	// it is the inherited method from parent with same parameter.
		
		System.out.println("Tiger hunts and eat.");
	}
	
	public void eat() {	// However this is overloading method of child class and its specialized method of child class.
		
		System.out.println("Tiger hunts and eat.");
	}
	
	protected void sleep() {	// we can increase the visibility while overloading inherited methods
		
		System.out.println("Tiger is sleeping.");
	}
	
//	public int running() {	// the primitive return types cannot be changed. if void in parent then has to be void in child
//		
//		System.out.println("Tiger is running.");
//		return 10;
//	}
	
	public FighterPlane running() {	// co-variant return type are such return type where there is-A relationship.
		
		System.out.println("Tiger is running");
		FighterPlane fp = new FighterPlane();
		return fp;
	}
}

public class in_05 {
	
	public static void main(String a[]) {
		
		Tiger t = new Tiger();
		t.eat();
		
	}
}
