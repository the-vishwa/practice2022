package innerOuterClasses;

public class Outer {
	Integer i = 100;
	String s = "vishwa";

	static class Innerrr {
		static Integer a = 10;

		static void m1() {
			System.out.println("i am static method of inner class ");
			System.out.println(Innerrr.a);
		}

	}

	public static void main(String[] args) {
		
		Innerrr.m1();
	}
}
//Inner in = new Inner();
