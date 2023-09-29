package vishwa_com.bank.info;

public class Bank {

	private String bankName;
	private String employeeName;
	private int empId;

	Bank() {
	}

	public Bank(String bankName, String employeeName, int empId) {

		this.bankName = bankName;
		this.employeeName = employeeName;
		this.empId = empId;

	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployee(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

}
