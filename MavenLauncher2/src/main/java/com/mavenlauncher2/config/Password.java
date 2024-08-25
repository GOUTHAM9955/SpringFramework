package com.mavenlauncher2.config;

public class Password {
	
	String algo=null;

	public Password(String algo) {
		System.out.println("Password is created");
		this.algo = algo;
	}
	
	public void passwordGenrator() {
		System.out.println("Method of password class got invoked with algo: " +algo);
	}

}
