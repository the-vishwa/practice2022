package oops;

public class Test {

	void m1() {
		int a = 10; //
		System.out.println(a);
// for local variable that is only one modifier that is final
//so we must have to initialize it at same time
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();

	}

}
