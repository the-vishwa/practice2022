package vishwa_stringDemo_23_To_27_12;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = new String("u cant change me");
		String s2 = new String("u cant change me");
		System.out.println(s1 == s2);// false
		String s3 = "u cant change me";
		System.out.println(s1 == s3); // false
		String s4 = "u cant change me";
		System.out.println(s3 == s4); //true
		String s5 = "u cant" + " change me"; // remove space form u cant >end
		System.out.println(s3 == s5); //true
		String s6 = "u cant";
		String s7 = s6 + "change me";
		System.out.println(s3 == s7); // false
		final String s8 = "u cant";
		String s9 = s8 + " change me";  // remove space from cm >start
		System.out.println(s3 == s9); //true
		System.out.println(s6 == s8); //true
		
		
		
		System.out.println("________ / practice\\_________");
		
		String X1 ="abc" + "pqr";
		String Y1 = "abcpqr";
		System.out.println(X1==Y1);// true
		
		String x3 = "abc";
		String y3 = x3 + "pqr";
		String z3 = "abcpqr";

		System.out.println(x3 == y3); // false
		System.out.println(x3 == z3); // false
		System.out.println(y3 == z3); // false

		final String x = "abc";
		String y = x + "pqr";
		String z = "abcpqr";

		System.out.println(x == y); // false
		System.out.println(x == z); // false
		System.out.println(y == z); // true

		final String x1 = "abc";
		String y1 = x1 + "pqr";
		String z1 = x1.concat("pqr");

		System.out.println(x1 == y1); // false
		System.out.println(x1 == z1); // false
		System.out.println(y1 == z1); // false

		final String x2 = "abc";
		String y2 = x2.concat("pqr");
		String z2 = "abcpqr";

		System.out.println(x2 == y2); // false
		System.out.println(x2 == z2); // false
		System.out.println(y2 == z2); // false
		
	}

}
