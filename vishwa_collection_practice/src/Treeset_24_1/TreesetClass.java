package Treeset_24_1;

import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	int a;
	int b;

	public Employee() {
	}

	public Employee(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Student [a=" + a + ", b=" + b + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if(this.a >= o.a) {
			return +1;
		}else {
			return-1;
		}
	}

}

public class TreesetClass {
	public static void main(String[] args) {
		TreeSet<Employee> tree = new TreeSet<>();
		tree.add(new Employee(20, 30));
		tree.add(new Employee(14, 90));
		tree.add(new Employee(10, 20));
		tree.add(new Employee(9, 20));
		tree.add(new Employee(10, 30));

		for (Employee s : tree) {
			System.out.println(s);
		}
	}
}
