package lamdaExpresion_FunctionalInterface;

interface Hello {
	void m1();
}

interface HH {
	int m2(String str);
}

public class A {
	public static void main(String[] args) {
		Hello h = () -> System.out.println("hello");
		h.m1();

		// HH hh = (String str)-> { return str.length();}; //traditional way
		HH hh = (str) -> str.length();
		int ii = hh.m2("vishwa");
		System.out.println(ii);
	}
}