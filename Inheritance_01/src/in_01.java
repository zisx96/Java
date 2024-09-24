
class Telusko{   // parent class or super class
	
	int age;
	
	void disp() {
		
		age = 10;
		
		System.out.println("Telusko is " + age + " year old");
	}
}
 
class Alien extends Telusko{  // child class or sub class
	
	
}

public class in_01 {

	public static void main(String[] args) {
		
		Telusko t = new Telusko();
		t.disp();
		
		Alien a = new Alien();
		a.disp();
	}

}
