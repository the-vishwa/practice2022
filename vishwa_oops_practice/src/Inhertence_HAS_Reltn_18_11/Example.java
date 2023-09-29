package Inhertence_HAS_Reltn_18_11;

class Rwl { // composition
	void print(int a) {
		System.out.println(a);
	}
}

class Student1 {
	int sum(int a, int b) {
		int i = a - b;
		return i;
	}
}

class Student2 {
	int sub(int a, int b) {
		int i = a + b;
		return i;
	}

}

public class Example {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		int result = s1.sum(100, 220);

		Student2 s2 = new Student2();
		int result1 = s2.sub(100, 220);

		Rwl r = new Rwl();
		r.print(result);
		r.print(result1);

	}

}