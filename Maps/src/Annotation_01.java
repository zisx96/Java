
class Animal{
	
	public void animalUsuallyHuntsAndEat() {
		
		System.out.println("animal is eating.");
	}
}

class Tiger extends Animal {
	
	// overriding parent class method to suit child requirement
	
	@Override
	public void animalUsuallyHuntsAndEat() {
		
		System.out.println("Tiger hunts and eat.");
	}
	
}

public class Annotation_01 {

	public static void main(String[] args) {
		
		Tiger t = new Tiger();
		t.animalUsuallyHuntsAndEat();

	}

}
