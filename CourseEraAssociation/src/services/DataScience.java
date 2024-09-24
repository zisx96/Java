package services;

public class DataScience implements CCourse {

	@Override
	public boolean getCourse(double amount) {
		
		System.out.println("Data Science Course purchased for amount " + amount);
		return true;
	}

}
