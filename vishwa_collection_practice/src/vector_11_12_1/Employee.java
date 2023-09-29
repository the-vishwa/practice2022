package vector_11_12_1;

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

}
