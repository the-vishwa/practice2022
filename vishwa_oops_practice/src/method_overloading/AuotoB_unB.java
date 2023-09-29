package method_overloading;

public class AuotoB_unB {

	void m1(int a) {
		System.out.println("int");
	}

	void m1(byte a) {
		System.out.println("byte");
	}

	void m1(Byte a) { // autoboxing
		System.out.println("Byte");
	}

	public static void main(String[] args) {
		AuotoB_unB aa = new AuotoB_unB();
		byte b = 10;
		aa.m1(b);
		//aa.m1(10);

	}
}
