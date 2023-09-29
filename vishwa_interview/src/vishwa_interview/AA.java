package vishwa_interview;

public class AA {
public static void main(String[] args) {
	//java lang 
	// que 3 ans
	String s = "vishwa";
	String s1 =s.intern();
	System.out.println(s1);
	
	String s2 = "vishwa";
	s2.concat("rajput");
	s2=s2.concat("sisodiya");
	System.out.println(s2);
	//mutable thread safe
	StringBuffer ss = new StringBuffer("vishwa");
	     ss.append(" sisodiya");
	     ss=ss.append(" raj");
	   System.out.println(ss);
	
	
}
}
