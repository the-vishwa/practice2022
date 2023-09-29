package hashcodedemomo;

public class RevesreString {
	public static void main(String[] args) {

		String str = "abc";

		String s = "";
		
		StringBuffer br = new StringBuffer();

		for (int i = str.length() - 1; i >= 0; i--) {
//
			char ch = str.charAt(i);
			s=s+br.append(ch);
			//s = s + str.charAt(i);

		}

		//System.out.println(s);
		System.out.println(br);

	}
}
