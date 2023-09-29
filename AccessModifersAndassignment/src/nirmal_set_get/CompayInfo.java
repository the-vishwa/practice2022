package nirmal_set_get;

public class CompayInfo {
	
	private String CompanName;
	private String CompanyEmployee;
	private char CompanyGrade;
	
	
	public CompayInfo(String companName, String companyEmployee, char companyGrade) {
		
		CompanName = companName;
		CompanyEmployee = companyEmployee;
		CompanyGrade = companyGrade;
	}


	public String getCompanName() {
		return CompanName;
	}


	public void setCompanName(String companName) {
		CompanName = companName;
	}


	public String getCompanyEmployee() {
		return CompanyEmployee;
	}


	public void setCompanyEmployee(String companyEmployee) {
		CompanyEmployee = companyEmployee;
	}


	public char getCompanyGrade() {
		return CompanyGrade;
	}


	public void setCompanyGrade(char companyGrade) {
		CompanyGrade = companyGrade;
	}

}
