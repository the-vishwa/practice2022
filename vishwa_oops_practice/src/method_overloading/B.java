package method_overloading;

public class B {
	
	void m1(byte a) {
		System.out.println("byte");
	}
	void m1(int a) {
		System.out.println("int");
	}
		
	void m1(Byte b) {
		System.out.println("Byte");
	}
	
	
public static void main(String[] args) {
	B bb =new B();
//	int i =10;
//	
//	byte b1=(byte)i;// type cast
//	bb.m1(b1);
	
	short s= 10;
	//byte b2 =(byte)s;
	bb.m1(s);
	
}
}
