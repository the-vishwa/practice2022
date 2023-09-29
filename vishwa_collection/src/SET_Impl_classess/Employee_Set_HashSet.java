package SET_Impl_classess;

import java.util.HashSet;

class Employee {
	private Integer empId;
	private String empName;
	private Address adr;

	public Employee() {
	}

	public Employee(Integer empId, String empName, Address adr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.adr = adr;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
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
		return "Employee [empId=" + empId + ", empName=" + empName + ", adr=" + adr + "]";
 //	return "Employee [empId=" + empId + ", empName=" + empName +",adr=" + adr +""]";
	}

	@Override
	public int hashCode() {
		return this.empId.hashCode() + this.empName.hashCode() + this.adr.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Employee e1 = (Employee) obj;
		if (this.getEmpId().equals(e1.empId) && this.getEmpName().equals(e1.empName) && this.getAdr().equals(e1.adr)) {
			return true;
		}
		return false;
	}

}

public class Employee_Set_HashSet {
	public static void main(String[] args) {
// 	Employee e1 = new Employee(3432, "Vishwa", new Address("55,harchand nagar", "swaminarayan marg , dondaicha", 425408));
//		e.add(e1);
//    Employee e2 = new Employee(3432, "Vishwa", new Address("55,harchand nagar", "swaminarayan marg , dondaicha", 425408));
//		e.add(e2);
//		System.out.println(e.size());
		
		Address adr =new Address("55,harchand nagar", "swaminarayan marg , dondaicha", 425408);
		HashSet<Employee> e = new HashSet<>();
//		Employee e1 = new Employee(3432, "Vishwa", new Address("55,harchand nagar", "swaminarayan marg , dondaicha", 425408));
//		Employee e2 = new Employee(3432, "Vishwa", adr);
		
		
		boolean b = e.add(new Employee(3432, "Vishwa", adr));
		boolean b1 = e.add(new Employee(3432, "Vishwa", adr));
		boolean b2 = e.add(new Employee(3432, "Vishwa", new Address("55,harchand nagar", "swaminarayan marg , dondaicha", 425408)));
		boolean b3 = e.add(new Employee(3432, "Vishwa", new Address("55,harchand nagar", "swaminarayan marg , dondaicha", 425408)));
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(e.size());
		
	}
}





//		boolean b = e.add(new Employee(2, "vishwa"));
//		boolean b1 = e.add(new Employee(2, "vishwa"));
//		System.out.println(b);
//		System.out.println(b1);
//		System.out.println(e.size());

//System.out.println(e1.hashCode());
//System.out.println(e2.hashCode());
//System.out.println(e1.hashCode()==e2.hashCode()); 
//e.add(e1);
//e.add(e2);
//System.out.println(e.size());
//System.out.println(e1.equals(e2));

//HashSet<Address>adr1 = new HashSet<>();
//Address adr = new Address("61-A,vedant society", "MG road pune", 440044);

//	e.add(e1);
//	adr1.add(adr);

//System.out.println(e.equals(adr1));