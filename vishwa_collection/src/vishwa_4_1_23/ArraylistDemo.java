package vishwa_4_1_23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
//		Collection c = new ArrayList();
//		List list = new ArrayList();

		ArrayList al = new ArrayList();
		al.add(100);
		al.add("hi");
		al.add(new Integer(100));
		Student s = new Student();
		al.add(s);

		System.out.println(al); // or al.add(new Student());
		// Insertion order preserved
		// duplicate objects ar allow
		// dif types of obj are allow / or we can say hetrogeneous obj is allow
		// null object insertion also allow

	}

}

class Student {
	@Override
	public String toString() {

		return "hello";
	}
}