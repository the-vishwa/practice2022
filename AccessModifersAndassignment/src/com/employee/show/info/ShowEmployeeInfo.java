package com.employee.show.info;

import com.employee.info.Employee;
import com.employee.info.EmployeeInfo;


public class ShowEmployeeInfo {

	public static void main(String[] args) {
		
				
		EmployeeInfo obj = new EmployeeInfo();
		Employee[]  employeeArray = obj.getEmployeeInfo();
		
		for(int i =0 ; i < employeeArray.length; i++) {
			
			System.out.println(employeeArray[i].getEmployeeName());
			System.out.println(employeeArray[i].getEmployeeNumber());
			System.out.println(employeeArray[i].getOfficeName());
			System.out.println(">>>>>>>>>>>>>>>");
			
		}
		
	}
}
