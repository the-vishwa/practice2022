package factoryMethod_Iterator_13_15_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IncreaseSalaryEmployee {
	ArrayList<Employee1> e;

	public IncreaseSalaryEmployee() {
		this.e = new ArrayList<>();
	}

	public static void main(String[] args) {
		ArrayList<Employee1> e = new ArrayList<>();
		e.add(new Employee1("vishwa", 7000.60));
		e.add(new Employee1("nirmal", 10000.40));
		e.add(new Employee1("vinayak", 10000.90));
		e.add(new Employee1("mani", 9000.20));

		ListIterator<Employee1> itr = e.listIterator();
		while (itr.hasNext()) {
			Employee1 ee = itr.next();
			if (ee.getSalary() <= 10000.00) {
				System.out.println(ee.getName());
				System.out.println("increment=" + (ee.getSalary() + ee.getSalary() * 50 / 100));
//				 ee.setSalary(ee.getSalary()*(50+100/100));
//				 System.out.println("increment=" + ee.getSalary());
			} else if (ee.getSalary() > 10000.00) { // here no need to take condition
				System.out.println(ee.getName());
//				ee.setSalary(ee.getSalary()*(40+100/100));
//				System.out.println("increment=" + ee.getSalary());
				System.out.println("increment=" + (ee.getSalary() + ee.getSalary() * 40 / 100));

			}

		}

	}
}
