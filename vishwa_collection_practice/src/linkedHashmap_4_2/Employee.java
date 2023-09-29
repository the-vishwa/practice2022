package linkedHashmap_4_2;

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
	public int hashCode() {
		return this.id.hashCode() + this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Employee e1 = (Employee) obj;
		if (this.getId().equals(e1.id) && this.getName().equals(e1.name)) {
			return true;
		}
		return false;
	}
}