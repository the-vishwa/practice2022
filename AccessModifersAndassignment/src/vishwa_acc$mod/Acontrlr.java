package vishwa_acc$mod;

public class Acontrlr {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("VISHWA");

// parent have earned for himself so no need to borrow from child
// so reverse --> B b = new A();   can't be possible
// easy way to understand like go through A >>>>>>>>>>>>> B
// Don't go through  B <<<<<<<<<<<<<<<< A
// and here class is an abstract so we can't create an object of abstract class
		A a = new D();
		a.m1();
		System.out.println("___________________________");
		B b = new B();
		b.m1();
		b.m2();
		System.out.println("___________________________");
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
		System.out.println("___________________________");
		D d = new D();
		d.m1();
		d.m2();
		d.m3();
		d.m4();

	}

}
