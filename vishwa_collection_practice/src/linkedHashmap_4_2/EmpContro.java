package linkedHashmap_4_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class EmpContro {
	public static void main(String[] args) {

		HashMap<Employee, Double> map = new HashMap<>();
		map.put(new Employee(3, "mahanayak"), 20003.45);
		map.put(new Employee(5, "bacchan"), 57675.65);
		map.put(new Employee(3, "shahensha"), 556567.78);

//	 OR
//	Employee e = new Employee(3, "mahanayak");
//	map.put(e, 20003.45);

		System.out.println(map.size());
		Double d = map.get(new Employee(3, "mahanayak"));
		System.out.println(d);

		// System.out.println(map);

		Set<Employee> set = map.keySet();
//	Iterator<Employee> itr = set.iterator();
//	while (itr.hasNext()) {
//		Employee key = itr.next();
//		Double value = map.get(key);
//		System.out.println(key + "=>" + value);
//
//	}

		for (Employee e : set) {

			Double value = map.get(e);

			System.out.println(e + "=>" + value);

		}

	}
}
