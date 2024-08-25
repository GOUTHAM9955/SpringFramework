package com.mavenlauncher3.services;

import org.springframework.stereotype.Component;

@Component
public class FedEx implements DeliveryService{

	public FedEx()
	{
		System.out.println("FedEx bean is created");
	}	@Override
	public Boolean deliverProduct(Double amount) {
		System.out.println("Deliverred by FedEx, amount is" +amount );
		return true;
	}

}
