package method_overloading;

public class Test1 {

	void m1(Object o) {
		System.out.println("Object o");
	}
	
	void m1(Byte b) {
		System.out.println("Byte b");
	}
	
	void m1(StringBuffer sb) {
		System.out.println("StringBuffer b");
	}
	public static void main(String[] args) {
		Test1  t = new Test1();
		
		t.m1(""); // m1(String) >> m1(Object)
		
		t.m1(10);  // m1(int) >> m1(Object)
		
		t.m1(null);
	}
}
