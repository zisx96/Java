package main;

import services.BlueDart;
import services.FirstFlight;

public class LaunchAmazon_01 {

	public static void main(String[] args) {
		
		// Constructor injection
		
		Amazon amz = new Amazon(new FirstFlight());	// first flight is dependent object and this called as dependency injection
		
//		amz.setService(new EcartFedex());	// setter injection through setter
		
//		amz.setService(new BlueDart());
		
		boolean status = amz.deliverTheProduct(4563.5);
		
		if(status) {
			
			System.out.println("Product delivered");
		}
		else
			System.out.println("Failed !!!");
	}

}
