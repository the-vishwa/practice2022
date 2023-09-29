package innerOuterClasses;

public class OuterC {
	class InnerC {
		void m1() {
			System.out.println("inner class m1 method");
		}

	}

	void outMethod() {
		InnerC i = new InnerC();
		i.m1();
	}
public static void main(String[] args) {
	OuterC oc =  new OuterC();
			oc.outMethod();
}
}
