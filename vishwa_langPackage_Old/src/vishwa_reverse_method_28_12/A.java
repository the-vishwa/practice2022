package vishwa_reverse_method_28_12;

public class A {

public static void main(String[] args) {
	String s = "vishwa";
	StringBuffer rev = new StringBuffer();
	    //String ss = new String();
	for (int i =  s.length() - 1;  i >= 0 ; i--) {
		char c = s.charAt(i);
		rev = rev.append(c) ;
	}
	System.out.println(rev);
	
	
	
}
	
}
