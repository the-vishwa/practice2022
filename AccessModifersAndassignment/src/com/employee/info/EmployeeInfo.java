package com.employee.info;

public class EmployeeInfo {

	
	public Employee[] getEmployeeInfo() {
		
		Employee[] emp = new Employee[4];
		
		emp[0] = new Employee("sandesh",23,"Bhandari associate pvt ltd");
		emp[1] = new Employee("Kedar",24,"BCCI");
		emp[2] = new Employee("mahesh",25,"IBM");
		emp[3] = new Employee("Chiru",26,"bank of America");
				
		return emp;
	}
}

// EmployeeInfo
// com.employee.info.EmployeeInfo


