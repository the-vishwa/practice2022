package method_overloading;

public class C {
	
	void m1(int a) {
		System.out.println("int");
		
	}
	void m1(Number n) {
		System.out.println("number");
		
	}
	void m1(Object o) {
		System.out.println("object");
		
	}
	
public static void main(String[] args) {
	C c = new C();
	Byte b = 10;
	c.m1(b); // num
	
	float f =10.10f;
	c.m1(f); // numb
	
	byte b1 = 10;
	c.m1(b1); //int 
	
	
}
}
