package abstract_30_11;

class A {
	void m1() {
		System.out.println("wrng way");
	}
}
abstract class B extends A {
	abstract void m1();
//	 void m1() {}
}
class C extends B {
	void m1() {
		System.out.println("good way");
	}
}
public class Point {
	public static void main(String[] args) {
		A aa = new A();
		aa.m1();//
		A a = new C();
		a.m1();//
		B b = new C();
		b.m1();

	}

}
