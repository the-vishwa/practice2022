package Flexibility_or_polymorphism;

public class Test {
// compile time polymorphism
	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c, int d) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.sum(10, 20);
	}
}
