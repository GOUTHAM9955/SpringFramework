package com.mavenlauncher1.services;

public class DHL implements DeliveryService {
	public DHL() {
		System.out.println("DHL bean is created");
	}
	@Override
	public Boolean deliverProduct(Double amount) {
		System.out.println("Deliverred by DHL, amount is" +amount );
		return true;
	}

}
