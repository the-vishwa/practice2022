package super_this;

class A1 {
	int x = 10;

	void m1() {
		System.out.println("m1111");
	}

	void m2() {
		System.out.println("m2 a1");
	}

}

class B1 extends A1 {
	int x = 100;

	void m3() {

	}

	void m2() {
		super.m2();
		System.out.println("m2 B1");

	}
}

public class BBB {
	public static void main(String[] args) {
		A1 a = new B1();
		System.out.println(a.x);
		
		B1 b = new B1();
		b.m2();

	}
}
