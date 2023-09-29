package method_overloading;

public class NewTest {

	 void m1(byte a) {
		 System.out.println("m1(int)");
	 }
	 
	 void m1(Integer b) {
		 System.out.println("m1(Integer)");
	 }
	
	public static void main(String[] args) {
		
		NewTest t=new NewTest();
		
//		short b = 10;
//		t.m1(b); //  m1(int)
		
	//	t.m1(10); // m1(int)
	}
}
