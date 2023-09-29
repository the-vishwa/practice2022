package treeset_27_1_comparator;

public class Employee {
	private Integer id;
	private String name;

	public Employee() {
	}

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if (this.getId().equals(e.id) && this.getName().equals(e.name)) {
			return true;
		}
		return false;
	}
}
