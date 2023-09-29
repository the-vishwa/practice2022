package rwl_16_10_2022;

public class RelationalOptExamples {

	public static void main(String[] args) {
		
		//int i = 10 > 20;
		// Type mismatch: cannot convert from boolean to int
		
		//double d = 34 > 21;
		// Type mismatch: cannot convert from boolean to double
		// Type mismatch: cannot convert from boolean to double
		
		boolean r = 10 > 5; // true;
		System.out.println(r);
		
		int a = 10; int b = 20;
		boolean r1 = b >= a;
		System.out.println(r1);
		// -----------------------------------------
		int age = 19;
		if(age >= 18) {
			System.out.println("allow for voter id card");
		}else {
			System.out.println("Reject");
		}
		//-------------------------------------------
		boolean b1 = true;
		boolean b2 = true;
		
	    //boolean r2 = b1 >= b2;
	    // The operator >= is undefined for the argument type(s) boolean, boolean
		
		boolean j = true;
		int m = 10;
		
		//boolean k = j >= m;
		// The operator >= is undefined for the argument type(s) boolean, int
		
		
		A obj1= new A();
		A obj2 = new A();
		
	//	boolean r4 = obj1 >= obj2;
		// The operator >= is undefined for the argument type(s) rwl_16_10_2022.A, rwl_16_10_2022.A
		// rwl_16_10_2022.A
		
			
		
		
		
	}
}

class A{
	
}

class B{
	
}

class C{
	
}