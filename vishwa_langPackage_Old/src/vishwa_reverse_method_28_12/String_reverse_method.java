package vishwa_reverse_method_28_12;

public class String_reverse_method {
	public static void main(String[] args) {
		// if u want to reverse string obj then use StringBuffer instead of String see
		// class A program
		String s = "vishwa";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			rev = rev + c;
		}
		System.out.println(rev);

		// string Buffer have reverse method
		String s1 = "hi hello";
		StringBuffer br = new StringBuffer("hi hello"); // s1
		StringBuffer br1 = br.reverse();
		System.out.println(br1);

		// or

		// StringBuffer br11 = new StringBuffer("thalaiva"); // s1
		System.out.println(new StringBuffer("thalaiva").reverse());

	}
}

// String sr = ""abc";
//String sr1 = String.valueOf("abc");
// String sr2 = new String ("abc");
//String dw = new String();
