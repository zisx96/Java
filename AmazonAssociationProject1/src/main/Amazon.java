package main;

import services.DeliveryServices;

public class Amazon {
	
	private DeliveryServices service;
	
	public Amazon(DeliveryServices service) {
		
		this.service = service;
	}
	
	public void setService(DeliveryServices service) {
		
		this.service = service;
	}

	public Amazon() {
		
	}

	public boolean deliverTheProduct(double amount) {
		
		return service.deliveryProduct(amount);
	
	}
}
