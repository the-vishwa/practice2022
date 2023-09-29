package Inhertence_HAS_Reltn_18_11;

//strong association
//anadar kuch method h o jis ko method chahiye o c.method cll kardega 
//jis ko method chahiye o b.method cll kardega
//inheritance

class A {
	B b;
	C c;

	A(B b, C c) {
		this.b = b;
		this.c = c;
	}

//	void m1() {
//		B b = new B();
//		System.out.println(b.minus(40, 30));
//		C c = new C();
//		System.out.println(c.sum(10, 20));
//	}

	void print(int p) {
		System.out.println(p);
	}

}

class B {
	int minus(int a, int b) {
		int v = a - b;
		return v;
	}

}

class C {
	int sum(int a, int b) {
		int n = a + b;
		return n;
	}
}

public class Composition {

	public static void main(String[] args) {
		B b = new B();
		int i = b.minus(12, 20);
		C c = new C();
		int i1 = c.sum(12, 30);
		A a = new A(b, c);
		a.print(i);
		a.print(i1);

	}

}
