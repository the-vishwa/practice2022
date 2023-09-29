package com.company.info;

public class Company {
	
	private String CompanyName;
	private String CompanyOwner;
	private String companyCeo;
	private int CompnayEmployees;
	public Company(String companyName, String companyOwner, String companyCeo, int compnayEmployees) {
		
		CompanyName = companyName;
		CompanyOwner = companyOwner;
		this.companyCeo = companyCeo;
		CompnayEmployees = compnayEmployees;
		
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getCompanyOwner() {
		return CompanyOwner;
	}
	public void setCompanyOwner(String companyOwner) {
		CompanyOwner = companyOwner;
	}
	public String getCompanyCeo() {
		return companyCeo;
	}
	public void setCompanyCeo(String companyCeo) {
		this.companyCeo = companyCeo;
	}
	public int getCompnayEmployees() {
		return CompnayEmployees;
	}
	public void setCompnayEmployees(int compnayEmployees) {
		CompnayEmployees = compnayEmployees;
	}
	
	

}
