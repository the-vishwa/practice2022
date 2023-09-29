package hashcodedemomo;

class Test {
	
	int a;
	
	public void setA(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}

	public void m1(Object o) { // o =new A();
		A aa = (A) o;
		aa.m2();
		
		// Object o= =new A();
		//A aa = (A) o;
		
		//pan as chalnar nahi
//		o.m2

	}

}

public class A {

	public void m2() {
		System.out.println("__");
	}

	public static void main(String[] args) {

		A a = new A();

		final Test t = new Test();
		t.setA(12);
		t.setA(13);
		t.setA(130);
		System.out.println(t.getA());
		t.m1(a);
	}

}
