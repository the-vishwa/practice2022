package rwl_29_10_22_Relational_opt;

public class Example {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		boolean r = a>b;  // false
		
		int a1 = 10;
		int a2 = 10;
		
		boolean r2 = a1>a2; // false
		
		boolean r3 = a1>=a2; /// true
		
		boolean r4 = a1 <= a2; // true
		
		
		int a5 = 66;
		double a6 = 66.01;
		char ch = 'B';
		
		boolean r5 = a5 >= a6;
		System.out.println(r5);
		
		System.out.println(a5>=ch);
		
		// -----------------------------------------
		
		boolean b9 = true;
		boolean b10 =  true;
		//boolean r9 = b9 >= b10;
		
		int a4 = 10;
		int a12 = 20;
		int a13 = 13;
		
		//boolean r56 = a4<a12<a13;
		// The operator < is undefined for the argument type(s) boolean, int
		
		
	}
}
