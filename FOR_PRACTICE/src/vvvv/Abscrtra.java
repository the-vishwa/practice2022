package vvvv;

abstract class MMM {
	abstract void m1();
	//abstract void m4();
	private Integer a;
	
	public MMM(Integer a) {
		this.a=a;
		System.out.println(a);
		System.out.println("mini");
	}
	
	private void m2() {
	}
	
	
}

class NNN extends MMM {

	public NNN(Integer a) {
		super(a);
	System.out.println("hi");
	}

	@Override
	void m1() {
		System.out.println("hello");

	}
	
	private void m2() {}

}

public class Abscrtra {

	public static void main(String[] args) {
		MMM m = new NNN(10);
		m.m1();
		
		
	}
}
