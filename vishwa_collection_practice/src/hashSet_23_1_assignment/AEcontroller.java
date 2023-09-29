package hashSet_23_1_assignment;

import java.util.HashSet;

public class AEcontroller {
	public static void main(String[] args) {

		Address ad = new Address();
		ad.setLine1("mg road");
		ad.setLine2("pune");
		ad.setPin(5555);

		HashSet<Employee> set = new HashSet<>();

		set.add(new Employee(1, "vishwa", ad));
		set.add(new Employee(9, "nirmal", new Address("mg gali", "pune", 7899)));
		set.add(new Employee(12, "kuldip", new Address("mg colony", "pune", 7899)));

		for (Employee e : set) {
			System.out.println(e);
		}
	}
}
