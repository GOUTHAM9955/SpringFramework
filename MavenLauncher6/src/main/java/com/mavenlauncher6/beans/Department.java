package com.mavenlauncher6.beans;

public class Department {
	private Integer deptNo;
	private String deptName;
	
	public Department(Integer deptNo, String deptName) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
	}
	
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	public String getDepName() {
		return deptName;
	}
	public void setDepName(String depName) {
		this.deptName = depName;
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", depName=" + deptName + "]";
	}

	
	
}
