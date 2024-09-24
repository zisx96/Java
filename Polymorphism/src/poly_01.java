
class AeroPlane{
	
	public void taking() {
		
		System.out.println("Aero-Plane is taking off");
	}
	
	public void landing() {
		
		System.out.println("Aero-Plane is landing");
	}
	
	public void fly() {
		
		System.out.println("Aero-Plane is flying");
	}
	
}


class CargoPlane extends AeroPlane {
	
	public void taking() {
		
		System.out.println("Cargo-Plane is taking off");
	}
	
	public void fly() {
		
		System.out.println("Cargo-Plane is flying");
	}
	
	public void landing() {
		
		System.out.println("Cargo-Plane is landing");
	}
	
}

class FighterPlane extends AeroPlane {
	
	public void taking() {
		
		System.out.println("Fighter-Plane is taking off");
	}
	
	public void fly() {
		
		System.out.println("Fighter-Plane is flying");
	}
	
	public void landing() {
		
		System.out.println("Fighter-Plane is landing");
	}
	
	
}

class Airport {
	
	public void permit(AeroPlane aero) {
		
		aero.taking();
		aero.fly();
		aero.landing();
	}
}

public class poly_01 {

	public static void main(String[] args) {
		
		AeroPlane cp = new CargoPlane();	// up-casting
		AeroPlane fp = new FighterPlane();
		
		cp.taking();
		cp.taking();
		( (CargoPlane) cp).fly();	// down-casting
		
		System.out.println("*********************");
		
		Airport a = new Airport();
		
		a.permit(cp);
		a.permit(fp);
	}

}
