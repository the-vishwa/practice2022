package LinkdHashMap;

public class Employee {

	private Integer empId;
	private String empName;

	public Employee() {
	}

	public Employee(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;

	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public int hashCode() {
		return this.empId.hashCode() + this.empName.hashCode() ;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Employee e1 = (Employee) obj;
		if (this.getEmpId().equals(e1.empId) && this.getEmpName().equals(e1.empName)) {
			return true;
		}
		return false;
	}
	
}
