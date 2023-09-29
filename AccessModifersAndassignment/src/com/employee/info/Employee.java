package com.employee.info;

public class Employee {
	
	private String employeeName;
	private int employeeNumber;
	private String officeName;
	
	public Employee(String employeeName, int employeeNumber, String officeName) {
		super();
		this.employeeName = employeeName;
		this.employeeNumber = employeeNumber;
		this.officeName = officeName;
	}
	
	public Employee() {}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	
}

// Employee
// com.employee.info.Employee