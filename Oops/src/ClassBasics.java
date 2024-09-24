
class Dog{
	
	String name = "Dasy" ;
	int Cost;
	
	
	public void Bark() {
		
		System.out.println(this.name + " barks"  );
	}
	
	public void Run(String n) {
		
		System.out.println(n + " is Running");
	}
	
	public double CostOfDog(double c) {
		
		double gst = c * 1.2;
		
		return gst;
		
	}
}

public class ClassBasics {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		d.Bark();
		d.Run("Max");
		double NewGst = d.CostOfDog(500);
		
		System.out.println("The cost of the dog is: " + NewGst );
	}

}
