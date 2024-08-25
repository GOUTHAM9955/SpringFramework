package com.mavenlauncher5.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mavenlauncher5.services.DeliveryService;


public class Amazon {
	

	private DeliveryService service;
	

	public Amazon(@Qualifier("fedEx") DeliveryService service)
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

