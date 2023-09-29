package vishwa_13_11_child_parent;

public class Parent {

	void m1() {
		System.out.println("here am a m1 method of parent");
	}
	void m2() {
		System.out.println("here am a m2 method of parent");
	}
public boolean equals(Object obj) {
	return super.equals(obj);
}
}
class child extends Parent2{
	void m4() {
		System.out.println("here am a m4 method of child");
	}
	void m2() {
		System.out.println("here am a m2 method of child");
	}
}
class Parent1 extends Parent{
	void m2() {
		System.out.println("here am a m2 method of parent1");
	}
	void m1() {
		System.out.println("here am a m1 method of Parent1");
	}
}
class Parent2 extends Parent1{
	void m3() {
		System.out.println("here am a m3 method of parent2");
	}
	void m1() {
		System.out.println("here am a m1 method of Parent2");
	}
}