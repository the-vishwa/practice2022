package oops;

abstract class A1 {
	abstract void m1();

	void m2() {
		System.out.println("m2 of absttract class ");
	}

}

class B1 extends A1 {
	void m3() {
		System.out.println("m3 of A1");
	}

	@Override
	void m1() {
		System.out.println("m1 of child B1");

	}

	void m2() {
		System.out.println("m2 of B1 class ");
	}

}

public class AbstarctMethod_13_11 {
	public static void main(String[] args) {
		A1 a = new B1();
		a.m1();
		a.m2();
		methodSample(a);

		B1 b = new B1();
		b.m1();
		b.m2();

	}

	static void methodSample(A1 a) {
		a.m1();
		a.m2();
	}
}
