package com.mavenlauncher5.services;

import org.springframework.stereotype.Component;

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
