package services;

public class MetaWeb implements CCourse {

	@Override
	public boolean getCourse(double amount) {
		
		System.out.println("Meta Web Developer Course purchased for amount " + amount);
		return true;
	}

}
