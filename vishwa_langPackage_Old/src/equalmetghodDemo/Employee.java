package equalmetghodDemo;

public class Employee {

	Integer empId;
	String empName;

	Address adr;

	public Employee(Integer empId, String empName, Address adr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.adr = adr;
	}

	@Override
	public int hashCode() {

		return this.empId.hashCode() + this.empName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee em = (Employee) obj;

			if (this.empId.equals(em.empId) && this.empName.equals(em.empName)&& this.adr.equals(em.adr)) {
				return true;

			}

		}
		return false;

	}
	
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", adr=" + adr + "]";
	}

	public static void main(String[] args) {

		Address adr = new Address(4655, "pune");

		Employee e = new Employee(12, "vishwa", adr);
//		Employee e1 = new Employee(13, "vinayak", adr);
		Employee e1 = new Employee(12, "vishwa", adr);
		
		System.out.println();
		

		System.out.println(e.equals(e1));
		System.out.println(e == e1);

		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e.hashCode() == e1.hashCode());

	}

}
