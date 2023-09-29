package vishwa_hash_equal_20_12;

/**
 * @author vishw
 *
 */
public class Employee {
	private String name;
	private Integer empid;

	public int hashCode() {

		return this.empid.hashCode() + this.name.hashCode();

	}

	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if (this.name.equals(e.name) && this.empid.equals(e.empid)) {
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEmpid() {
		return this.empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + "]";
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("vishwa");
		e.setEmpid(20);

		System.out.println(e.empid);
		
		
		Employee e1 = new Employee();
		e1.setName("vishwa");
		e1.setEmpid(20);

		
		
		
		System.out.println(e.equals(e1));

		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());

		System.out.println(e.hashCode() == e1.hashCode()); // for true ......first we have to override that hashcode
															// method

	}

}
