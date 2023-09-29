package oops;

class Employee1 {
	String name;
	int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

public class Practice1 {
	public static void main(String[] args) {
		Employee1 ee = new Employee1();
		ee.setName("nirmal"); // override that name so wont print that nirmal name
		ee.setName("vishwa");
		ee.salary = 23;
		ee.setSalary(24);

		System.out.println(ee.getName());
		System.out.println(ee.getSalary());

	}
}
