package vishwa_assign;

import java.util.ArrayList;
import java.util.Iterator;

class Employee {
	private String name;
	private Integer empId;

	public Employee(String name, Integer empId) {
		super();
		this.name = name;
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}

}

public class ArrayListofEmployee {
	public static void getId(Integer empId, ArrayList<Employee> AL) {
		Iterator<Employee> it = AL.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			if (e.getEmpId().equals(empId)) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Employee> AL = new ArrayList<>();
		AL.add(new Employee("vishwa", 1133));
		AL.add(new Employee("nirmal", 2233));
		AL.add(new Employee("premjit", 3333));
		AL.add(new Employee("kuldip", 4433));

		getId(4433, AL);
		

	}
}
