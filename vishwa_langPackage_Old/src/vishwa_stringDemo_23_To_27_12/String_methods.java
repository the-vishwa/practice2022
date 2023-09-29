package vishwa_stringDemo_23_To_27_12;

public class String_methods {

	public static void main(String[] args) {
		// 1 ] substring method
		String s = "hello good morning";
		String s1 = s.substring(0); // method
		String s2 = s.substring(6);
		System.out.println(s1);
		System.out.println(s2);

		String s3 = s.substring(11,18); 
		System.out.println(s3);
		
		// 2 ] replace method
		
		String s4=  "vishwajit";
		String s5 =s4.replace('t', 'T');
		System.out.println(s5);
		

		// 3 ] toUpper and toLowerCase
		
		String s6=  "vishwajit";
		String s7 =s6.toLowerCase();
		String s8=s6.toUpperCase();
		System.out.println(s7);
		System.out.println(s8);
		
		
		// 4 ] trim method
		
		String s9=  "  vishwa  jeet  ";
		String s10 =s9.trim();
		System.out.println(s10);
		
		
		// 5 ] indexOf method
		
		String s11=  "vishwajeet";
		//String s12 =s11.indexOf('w');
		//System.out.println(s12);
		System.out.println(s11.indexOf('w'));
		System.out.println(s11.lastIndexOf('w'));
		
	}

}
