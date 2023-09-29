package method_overloading;

public class TestNew {
 
	void m1(Object o) {
		System.out.println("m1(Object)");
	}
	
	void m1(Number o) {
		System.out.println("m1(Number)");
	}
	
	void m1(Float o) {
		System.out.println("m1(Float)");
	}
	
	void m1(String o) {
		System.out.println("m1(String)");
	}
	
	public static void main(String[] args) {
		
		TestNew t= new TestNew();
		
//		t.m1("");
//		
//		t.m1(new String());
//		
//		t.m1(new String(""));
//		
	t.m1(t);
//		
		t.m1(new Integer(10));
//		
		t.m1(new StringBuffer());
		
	}
}
