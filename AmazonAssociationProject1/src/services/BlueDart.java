package services;

public class BlueDart implements DeliveryServices {

	@Override
	public boolean deliveryProduct(Double amount) {
		
		System.out.println("Product delivered through Blue Dart and the amount paid is " + amount);
		
		return true;
	}

}
