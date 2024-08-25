package com.mavenlauncher1.services;

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
