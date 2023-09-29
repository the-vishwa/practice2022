package method_overloading;

public class Controller {

	public static void main(String[] args) {
		MethodOverloadingExample m = new MethodOverloadingExample();
		
	//	m.m1(10.10f,10);
	//--------------------------------------
		AutomaticPramotion a = new AutomaticPramotion();
		  
//		short b = 10;
//		a.m1(b);
		
//		a.m1(10, 10);
		
		float b = 10; short s = 69;
		a.m1(b, s);
		
		
		Object o = new AutomaticPramotion();
		

		
	}
}
