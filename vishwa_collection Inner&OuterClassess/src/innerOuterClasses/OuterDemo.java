package innerOuterClasses;

public class OuterDemo {
	Integer a =100;
	static String name="RWL";

//	OuterDemo() {
//		this.a = 10;
//		OuterDemo.name = "vishwa";
//		name = "hello";
//	}

	class Inner {
		void m2() {
			System.out.println("i am m2 method of inner class ");
			System.out.println(a);
			System.out.println(name);
//			System.out.println(name = "hi");
//			System.out.println(OuterDemo.name = "vishwa");
		}
	}

	void test() {
		Inner inner = new Inner();
		inner.m2();
	}

	static void test1() {
		// here inside outer class static method/area we can't directly create an object
		// of inner class it will show error
		OuterDemo od = new OuterDemo();
		OuterDemo.Inner inner = od.new Inner();
		inner.m2();
	}

	public static void main(String[] args) {
		OuterDemo od = new OuterDemo();
		OuterDemo.Inner inner = od.new Inner();
		inner.m2();

	}
}
