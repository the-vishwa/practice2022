package hashmap_1_2;

public class NonCharPrint {

	public static void main(String[] args) {

		String s = "vis hwa#@!";
		int a = 0;
		String ss = "";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {

			if (!Character.isLetterOrDigit(s.charAt(i)) ) {
				a++; // non char yat janar
				ss = ss + s.charAt(i);
				
			} 
			else {

				s1 = s1 + s.charAt(i);
			}
		}

		if (a == 0) {
			System.out.println("--");

		} else {
			System.out.println("non char cout is =" + a);
		}
		System.out.println("non char print=" + ss);
		System.out.println("lettrs print=" + s1);

	}

}
