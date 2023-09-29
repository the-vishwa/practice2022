package TreeSetExample;

import java.util.TreeSet;

class Student {
	int i;
	int j;

	public Student(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "Student [i=" + i + ", j=" + j + "]";
	}

}

public class TreeSetEx {
	public static void main(String[] args) throws Exception{
		TreeSet<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(2);
		set.add(300);
		set.add(100);
		set.add(20);
		set.add(10);

		System.out.println(set);
		System.out.println(set.size());

		TreeSet<String> set1 = new TreeSet<>();
		set1.add("A");
		set1.add("C");
		set1.add("B");
		set1.add("a");
		set1.add("Z");
		set1.add("Z");
		set1.add("b");
		System.out.println(set1);

//		TreeSet<Student> set2 = new TreeSet<>();
//		set2.add(new Student(10, 20));
//		set2.add(new Student(30, 20));
//		set2.add(new Student(50, 60));
//		System.out.println(set2);

	}
}
