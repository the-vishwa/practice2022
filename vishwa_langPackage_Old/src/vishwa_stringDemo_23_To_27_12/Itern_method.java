package vishwa_stringDemo_23_To_27_12;

public class Itern_method {

	/**
	 * s2 directly pointing to s1
	 */
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = s1.intern();
		System.out.println(s2);

		String s3 = new String("hi");
		String s4 = "hello";
		String s5 = s3.intern();
		System.out.println(s5);
	}
}