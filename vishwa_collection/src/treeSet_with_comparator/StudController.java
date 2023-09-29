package treeSet_with_comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class StudController {
	public static void main(String[] args) {
		
		TreeSet<Student> tr = new TreeSet<>(new MyStudClass());
		tr.add(new Student(12, "xyz"));
		tr.add(new Student(1, "abc"));
		tr.add(new Student(0, "vishwajitsinh"));
		tr.add(new Student(7, "vishwajitsinhRajput"));
		tr.add(new Student(0, "vishwajit"));
		tr.add(new Student(0, "vishwajitsinh"));

		for (Student s1 : tr) {
			System.out.println(s1);
		}
	}
}

class MyStudClass implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		//return o1.getRollNum().compareTo(o2.getRollNum());// for num duplicate

		// for duplicate object
		if (o1.getRollNum() < o2.getRollNum()) {
			return -1;
		} else if (o1.getRollNum() > o2.getRollNum()) {
			return 1;
		} else {
			if (o1.equals(o2)) {
				return 0;
			}
			return 1;
		}

	}
}
