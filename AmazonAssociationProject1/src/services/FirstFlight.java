package services;

public class FirstFlight implements DeliveryServices {

	@Override
	public boolean deliveryProduct(Double amount) {
		
		System.out.println("Product delivered through first flight and the amount paid is " + amount);
		
		return true;
	}

}
