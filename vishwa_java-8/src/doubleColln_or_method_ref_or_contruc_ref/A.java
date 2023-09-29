package doubleColln_or_method_ref_or_contruc_ref;

interface Test {
	void square(Integer i);

}

public class A {
	A() {}

	public A(int a) {
		System.out.println(a * a);
	}

	void m1(int a) {
		System.out.println(a * a);
	}

	static void m2(int a) {
		System.out.println(a * a);
	}

	public static void main(String[] args) {
//		Test t = (i)->System.out.println(i*i);
//		t.square(10);

		Test t1 = new A()::m1;
		t1.square(20);

		Test t2 = A::m2;
		t2.square(30);

	}

}
