package vishwa_stringDemo_23_To_27_12;

class sample {
}

/**
 
 */
public class Constructors_methods {

	public static void main(String[] args) {
		// 1 ] zero arg contruct
		String str = new String();

		/**
		 * param constrct 
		  2 ] public String(String literal){}
		 * hard coded data
		 */
		String str1 = new String("data");

		/**
		  3 ] String (StringBuffer br ) StringBuffer object convert in to String object
		 */
		StringBuffer br = new StringBuffer("good morning");
		String str2 = new String(br); // or cur br and paste new StringBuffer("good morning");
		System.out.println(str2);
		
		
		
		/**
		  no of charactors convert in to String
		 4 ]  public String (char[]  arr){}
		 */
		
		char [] ch = {'R','A','J','P','U','T'} ;
		String s = new String(ch);
		System.out.println(s);
		
		
		
		
		/**
		 5 ] public String (byte[]  b){}
		 */
		
		byte [] b = {97,98,99}; // askey value 
		String str3 = new String(b);
		System.out.println(str3);
		
		
		
		
		String v = new String("vishwa");
		System.out.println(v.length());
		
		String[] arr = {"abc","pqr","lmn"};
		System.out.println(arr.length);
		System.out.println(arr[1]); // or
		String bb = arr[1];
		System.out.println(bb);
		
		// finding specific char
		
		String ss = new String("vishwajitsing");
		  char chr =ss.charAt(4);
		  System.out.println(chr); //or 
		System.out.println(ss.charAt(4));
		
		
		// ingore case method
		
		String n = new String("rightway learning");
		String n1 = new String("RIGHTWAY LEARNING");
		System.out.println(n.equalsIgnoreCase(n1));
		
		
	}

}
