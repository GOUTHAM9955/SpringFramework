package com.mavenlauncher1.main;

import com.mavenlauncher1.services.DeliveryService;

public class Amazon {

	private DeliveryService service;
	
	public Amazon(DeliveryService service)
	{
		super();
		this.service = service;
	}
	
	public Amazon () {
		System.out.println("Amazon bean is created");
	}
	
	public void setService(DeliveryService service) {
		this.service = service;
	}
	
	public Boolean initiateDelivery(Double amount) {
		return service.deliverProduct(amount);
	}
}

