package method_overloading;

public class NewClassTest {
	
	NewClassTest(){}
	NewClassTest(int i){}
	NewClassTest(int i,int j){}
	

	void m1(Object o) {
		System.out.println("Object o");
	}
	

	void m1(Number n) {
		System.out.println("Number n");
	}
	
	void m1(Double s) {
		System.out.println("Double d");
	}
	
	
	public static void main(String[] args) {
		
		NewClassTest obj = new NewClassTest();
		
		obj.m1(10);
		
		obj.m1(new Integer(10));
		
		obj.m1(null);
		
	}
}
