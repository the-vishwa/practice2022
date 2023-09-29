package vishwa_22_11_box_unBox;

public class A {

	public void  m1(Object o) {
		System.out.println("m1 obj");
	}
	
	void m1 (String o) {
		System.out.println("m1 string");
	}
	public static void main(String[] args) {
		A a = new A();
		a.m1(""); // m1 String
		a.m1(a); // m1 obj
		a.m1(new String()); // m1 string
		a.m1(new String ("")); //m1 steing
		a.m1(new Integer(10)); // m1 obj
		a.m1(new StringBuffer()); //m1 obj
		
		
		
		
	}
}
