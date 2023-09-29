package hashSet_23_1_assignment;

public class Employee {
	private Integer id;
	private String name;
	private Address adr;

	public Employee() {
	}

	public Employee(Integer id, String name,  Address adr) {
		super();
		this.id = id;
		this.name = name;
		this.adr = adr;
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

	public Address getAddress() {
		return adr;
	}

	public void setAddress(Address adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Address=" + adr + "]";
	}

	@Override
	public int hashCode() {
		return this.getId().hashCode() + this.getName().hashCode() + this.getAddress().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		
		if (this.getName().equals(e.name) && this.getId().equals(e.id) && this.getAddress().equals(e.adr)) {
			return true;

		}
		return false;
	}
}
