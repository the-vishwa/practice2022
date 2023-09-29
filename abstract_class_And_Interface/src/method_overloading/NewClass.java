package method_overloading;

public class NewClass {

	public void m1(int a) {
		System.out.println("m1(int)");
	}
	
	public void m1(Number n) {
		System.out.println("m1(number)");
	}
	
	 public void m1(Object o) {
		 System.out.println("m1(Object)");
	 }
	
	 
	
	public static void main(String[] args) {
		NewClass n= new NewClass();
//		Byte b = 10;
//	n.m1(b);
//		
		float f = 23.90f;
		n.m1(f);
//		
//		byte b1 = 10;
//	n.m1(b1);
//		
//		boolean b2 = true;
//		n.m1(b2);
//		
//		Boolean b3 = false;
//		n.m1(b3);
//			
	}
}
