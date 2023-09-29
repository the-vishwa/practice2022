package methos;

public class AllStringClasses {

	public static void main(String[] args) {

		String s = "vishwa";
		s.concat("hi");
		System.out.println(s);
// tyala store karnyasathi ek new variable ghyava lagel tar vishwa hi yeil
// pan new variabl ghetla tr new object tayar hoil ha drwback ahe 		

		StringBuffer br = new StringBuffer("nirmal");
		br.append(" hi");
		System.out.println(br);

		// tas string buffr sathi nahi coz ha muttable ahe

		System.out.println("---------remove space------------");
		String str = " hello  hi good     morning ";

		String str1 = str.trim();

		String str2 = "";

		for (int i = 0; i < str1.length(); i++) {

//			char  ch = ;
			if (str1.charAt(i) != ' ' || (str1.charAt(i) == ' ' && str1.charAt(i + 1) != ' ')) {

				str2 = str2 + str1.charAt(i);

			}

		}
		System.out.println(str2);
		
		
		
		String sb = "abcde";
		System.out.println(sb.substring(0, 4));
		
		

	}

}
