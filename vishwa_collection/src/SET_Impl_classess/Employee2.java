package SET_Impl_classess;

import java.util.TreeSet;

public class Employee2 implements Comparable<Employee2> {

	private Integer empId;
	private String empName;

	public Employee2() {
	}

	public Employee2(Integer empId, String empName) {
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

	}

//	@Override
//	public int hashCode() {
//		return this.empId.hashCode() + this.empName.hashCode() ;
//	}
//
	@Override
	public boolean equals(Object obj) {
		Employee2 e1 = (Employee2) obj;
		if (this.getEmpId().equals(e1.empId) && this.getEmpName().equals(e1.empName)) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Employee2 o) {
		Integer g1 = this.getEmpId();
		Integer g2 = o.getEmpId();
		if (g1 < g2) {
			return -1;
		} else {
			if (this.equals(o)) {
				return 0;
			}
			return 1;
		}
		
	}
	public static void main(String[] args) {
		TreeSet<Employee2> em = new TreeSet<>();
		boolean b = em.add(new Employee2(2, "vishwa"));
		boolean b1 = em.add(new Employee2(2, "vishwa"));
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(em.size());
		
		
		
		
	}

	
	

}