package nirmal_methodOverloading_practice;

public class A {
	
	void m1(int a) {
		System.out.println("i am a int a");
		
	}
	
	void m1(double d) {
		System.out.println("i am a double");
	}
	
	void m1(Integer b) {
		System.out.println("i am a interger b");
		
	}
	void m4(Number n) {
		System.out.println("i am a number");
	}
	
	
	public static void main(String[] args) {
		
		
		A a = new A();
		float c = 10.00f;
		a.m1(c);
		
		
		Float z = 15.00f;
		a.m1(z);
		
		Long l = 1022532l;
		a.m1(l);
		
		
		
		
		
		
		
		
		
		
	}

}
    