package setImpleClass_19_1;

import java.util.HashSet;

public class Employee {
	private Integer id;
	private String name;
	private String companyName;

	public Employee() {
	}

	public Employee(Integer id, String name, String companyName) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", companyName=" + companyName + "]";
	}

	@Override
	public int hashCode() {
		return this.getId().hashCode() + this.getName().hashCode() + this.getCompanyName().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if (this.getName().equals(e.name) && this.getId().equals(e.id) && this.getCompanyName().equals(e.companyName)) {
			return true;

		}
		return false;
	}

	public static void main(String[] args) {
		HashSet<Employee> set = new HashSet<>();

//		Employee e = new Employee(101, "vishwa", "rwl");
//		Employee e1 = new Employee(101, "vishwa", "rwl");
//		System.out.println(set.add(e));
//		System.out.println(set.add(e1));
//		System.out.println(set.add(e));
//		System.out.println(set.size());

		System.out.println(set.add(new Employee(101, "vishwa", "rwl")));
		System.out.println(set.add(new Employee(101, "vishwa", "rwl")));
		System.out.println(set.size());


	}

}
