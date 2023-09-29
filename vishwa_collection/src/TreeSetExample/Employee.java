package TreeSetExample;

public class Employee implements Comparable<Employee> {
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
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
		// return "Employee [empId=" + empId + ", empName=" + empName +",adr=" + adr
		// +""]";
	}

	@Override
	public int hashCode() {
		return this.empId.hashCode() + this.empName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Employee e1 = (Employee) obj;
		if (this.getEmpId().equals(e1.empId) && this.getEmpName().equals(e1.empName)) {
			return true;
		}
		return false;
	}

	@Override
	// sort by num ascending order,if i cahnge plus 1 to minus 1 then it will goes
	// descending order
	public int compareTo(Employee o) {
		Integer e1 = this.getEmpId();
		Integer e2 = o.getEmpId();

//		if (e1 < e2) {
//			return -1;
//		}else {
//			return 1;
//		}
//	}

		// -----OR---------\\

		if (e1 <= e2) {
			return -1;
		} else if (e1 > e2) {
			return 1;
		} else {
			return 0;
		}
		
	
//		tree.add(new Employee(12, "A"));//1
//		tree.add(new Employee(21, "B"));//2
//		tree.add(new Employee(30, "C"));//3
//		tree.add(new Employee(14, "A"));//4
//		tree.add(new Employee(15, "D"));//5
//		tree.add(new Employee(15, "B"));//6	

	// this is used for without any duplicates
	
//		String name1 = this.getEmpName();
//		String name2 = o.getEmpName();
//		return name1.compareTo(name2);


}
}