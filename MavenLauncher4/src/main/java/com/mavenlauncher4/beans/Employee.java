package com.mavenlauncher4.beans;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	private String address;
	
	public Employee() {
		super();
		System.out.println("Bean of employee class got created invoking non-parameterised constructor");
	}

	public Employee(Integer id, String name, Double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		System.out.println("Bean of employee class got created invoking parameterised constructor");
	}
	
	public String taskOfEmployee() {
		return "Employee get's salary";
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

	
}
