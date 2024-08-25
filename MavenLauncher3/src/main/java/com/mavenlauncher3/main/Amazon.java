package com.mavenlauncher3.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mavenlauncher3.services.DeliveryService;

@Service
public class Amazon {
	
	//@Autowired
	//@Qualifier("fedEx")
	private DeliveryService service;
	
	@Autowired
	public Amazon(@Qualifier("fedEx") DeliveryService service)
	{
		super();
		this.service = service;
	}
	
	public Amazon () {
		System.out.println("Amazon bean is created");
	}
	
	//@Autowired
	//@Qualifier("fedEx")
	public void setService(DeliveryService service) {
		this.service = service;
	}
	
	public Boolean initiateDelivery(Double amount) {
		return service.deliverProduct(amount);
	}
}

