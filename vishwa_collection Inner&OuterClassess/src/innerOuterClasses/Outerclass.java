package innerOuterClasses;

public class Outerclass {

	class Inner {
		void m1() {
			System.out.println("m1 method");
		}

	}

	public static void main(String[] args) {
		Outerclass out = new Outerclass();
		Outerclass.Inner in = out.new Inner();
		//Inner in = out.new Inner();
		in.m1();
	}
}
