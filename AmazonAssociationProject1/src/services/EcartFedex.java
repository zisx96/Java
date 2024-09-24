package services;

public class EcartFedex implements DeliveryServices {

	@Override
	public boolean deliveryProduct(Double amount) {
		
		System.out.println("Product delivered through Fedex and the amount paid is " + amount);
		
		return true;
	}
	}

