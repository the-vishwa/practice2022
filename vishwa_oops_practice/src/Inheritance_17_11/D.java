package Inheritance_17_11;

class A {
	void m1() {
		System.out.println("m1 A");
	}

	void m2() {
		System.out.println("m2 A");
	}

	void m3() {
		System.out.println("m3 A");
	}
}

class B extends A {
	void m2() {
		System.out.println("m2 B");
	}
}

class C extends B{
	void m2() {
		System.out.println("m2 C");
	}
	void m1() {
		System.out.println("m1 C");
	}
}
class E extends A{
	void m1() {
		System.out.println("m1 E");
	}
	void m2() {
		System.out.println("m2 E");
	}
	void m3() {
		System.out.println(" m3 E");
	}
}
public class D {
	public static void main(String[] args) {
		C c = new C();
		c.m1();// c
		c.m2();// c
		c.m3();// a
		
//		B b = new B();
//		B b = new C();
//		b.m2();
		
		A e = new E();
		e.m1();
		e.m2();
		e.m3();

	}

}
