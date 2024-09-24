
class Car { 
	
	private String name = "Zonda"; // private String name
	
	void disp() {
		
		System.out.println("Name is "+ name);
	}
}

class Porche extends Car{
	
//private members of class will not get inherited
	
//	void disp2() {   
//		
//		name = "Ferrari";
//	}
	
}


public class in_03 {

	public static void main(String[] args) {
		
		Porche p = new Porche();
		p.disp();

	}

}
