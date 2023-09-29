package Flexibility_or_polymorphism;
// method overridng run time poly
public class AM {
	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b);
	}
	void m1() {
		System.out.println("vv");
	
	}
	
}
class PM extends AM{
	void m1() {
		System.out.println("vbvbv");
	}
	
}