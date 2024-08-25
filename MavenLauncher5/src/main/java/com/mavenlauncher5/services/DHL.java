package com.mavenlauncher5.services;

import org.springframework.stereotype.Component;

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
