// Multilevel Inheritance is allowed i.e one child can have
// its parent and it can have its own child class.

// Note -> Multiple Inheritance is not allowed in Java.
//		   A child class cannot have multiple parent class. 

// Note -> Constructor do not participate in inheritance but they do get executed when we 
//         create instance of child class because of super() call parent in child Constructor.


class Aeroplane {  	// behind the scene if a class does not extend 
				   	// by default it extends to object class.
					// Object class is a parent of all classes in java.
	void fly() {
		
		System.out.println("Aeroplane flies");
	}
	
	void landing() {
		
		System.out.println("Aeroplane is landing");
	}
}

class CargoPlane extends Aeroplane {
	
	
}

class CommercialPlane extends CargoPlane {
	
	
}

//class PassangerPlane extends Aeroplane {
//	
//	
//}

public class in_02 {

	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		cp.fly();
		cp.landing();
		
//		PassangerPlane pp = new PassangerPlane();
//		pp.fly();
//		pp.landing();
		
		CommercialPlane cp2 = new CommercialPlane();
		cp2.fly();
		cp2.landing();
	}

}
