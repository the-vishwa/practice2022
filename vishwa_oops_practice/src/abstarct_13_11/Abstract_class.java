package abstarct_13_11;

//50% declaration &50 % implementation=partially implementation
abstract class Mother {

	// she declared the things to make not implements
	// abstract void m1(String tomato, String potato, String masala);
	abstract void m1();

	void m2() {
		// how to make and she made it
		System.out.println("she made chapati");
	}
}

class Son extends Mother {
	@Override
	void m1() {
		System.out.println("he made sabji");
	}
}

class Kitchen {
	void sabji(Mother m) {
//		Mother mm = new Son();
		m.m1();
		m.m2();

	}
}

public class Abstract_class {
	public static void main(String[] args) {
		Mother mm = new Son();
		
		Kitchen k = new Kitchen();
		k.sabji(mm);

	}
}
