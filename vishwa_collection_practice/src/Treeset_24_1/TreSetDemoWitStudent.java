package Treeset_24_1;

import java.util.TreeSet;
//
class Student implements Comparable<Student>{
	int a;
	int b;
	
	public Student() {}

	public Student(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Student [a=" + a + ", b=" + b + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return 1; // if i return 0 then it will show only one obj
	}
	
}

public class TreSetDemoWitStudent {
// if i give -1 then desc order follow 
	public static void main(String[] args) {
		TreeSet<Student>tree = new TreeSet<>();
		tree.add(new Student(20, 30));
		tree.add(new Student(14, 90));
		tree.add(new Student(10, 20));
		tree.add(new Student(9, 20));
		tree.add(new Student(10, 30));
		
	for (Student s : tree) {
		System.out.println(s);
	}
      //	System.out.println(tree); //if i returnd zero
	}
}
