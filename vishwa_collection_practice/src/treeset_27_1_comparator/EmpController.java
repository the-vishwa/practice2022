package treeset_27_1_comparator;

import java.util.Comparator;
import java.util.TreeSet;

class orderEmployee implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName()); // or
		
//		int i = o1.getName().compareTo(o2.getName());
//		if (i == 0) {
//			return 0;
//		} else {
//			return +i;
//		}
	}
}

public class EmpController {
	public static void main(String[] args) {

		TreeSet<Employee> tr = new TreeSet<>(new orderEmployee());
		tr.add(new Employee(2, "vishwa"));
		tr.add(new Employee(4, "mani"));
		tr.add(new Employee(3, "thalaiva"));
		tr.add(new Employee(5, "nirmal"));
		tr.add(new Employee(6, "vishwa"));

		for (Employee e : tr) {
			System.out.println(e);
		}

	}
}
