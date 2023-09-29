package child.parent.rel;

public class Parent {

	void m1() {
		System.out.println("I am m1 method of Parent class");
	}
	
	void m2() {
		System.out.println("I am m2 method of Parent class");
	}
	
	
	public boolean equals(Object obj) {
		System.out.println("I am equals method of Parent class");
		
		return super.equals(obj);
	}
}

class Parent1 extends Parent{
	void m2() {
		System.out.println("I am m2 method of Parent1 class");
	}
	
	void m3() {
		System.out.println("I am m3 method of Parent1 class");
	}
}

class Parent2 extends Parent1{
	void m2() {
		System.out.println("I am m2 method of Parent2 class");
	}
	
	void m3() {
		System.out.println("I am m3 method of Parent2 class");
	}
}

class Child extends Parent2 {
	void m3() {
		System.out.println("I am m3 method of Child class");
	}
	
	void m4() {
		System.out.println("I am m4 method of Child class");
	}
}