package nirmal_abtract_practice;

abstract class A {

	abstract void m1();

}

class B extends A {
	void m1() {
		System.out.println("i have been complited m1 method in class B");
	}
}
