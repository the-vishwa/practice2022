package method_overloading;

public class A {

	void m1(long l) {
		System.out.println("i am long l");
	}
	
	void m1(Integer i) {
		System.out.println("i am Integer object type");
	}
	
	public static void main(String[] args) {
		
		A a=new A();
		Byte b=10;
		a.m1(b); // byte
		
	}
}
