package method_overloading;

public class A {
	void m1(int a) {
		System.out.println("int");
	}

	void m1(Integer a) {
		System.out.println("Integer");
	}

	public static void main(String[] args) {
		A a = new A();
		Byte b = 10;
		a.m1(b);// byte b = 10;
		// here unboxiung >in to  byte > // not found exact match
		// then auto promotion into int
	}
}
