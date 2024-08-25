package com.mavenlauncher1.services;

public class BlueDart implements DeliveryService{

	public BlueDart() {
		System.out.println("BlueDart Bean is created");
	}
	@Override
	public Boolean deliverProduct(Double amount) {

		System.out.println("Deliverred by BlueDart, amount is" +amount );
		return true;
	}

}
