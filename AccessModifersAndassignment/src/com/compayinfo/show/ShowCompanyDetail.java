package com.compayinfo.show;

import com.company.info.Company;
import com.company.info.CompanyInfo;

public class ShowCompanyDetail {

	public static void main(String[] args) {
		
		 CompanyInfo c = new CompanyInfo();
		 Company[] array = c. getcompanyinfo();
		 
		 for(int i =0; i<array.length; i++) {
			 
			 
			 System.out.println(array[i].getCompanyName());
			 System.out.println(array[i].getCompanyOwner());
			 System.out.println(array[i].getCompanyCeo());
			 System.out.println(array[i].getCompnayEmployees());
			 
			 System.out.println("----------------------------------");
		
		 }	

	}

}
