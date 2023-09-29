package vishwa_29_12;

public class Capaciity {

public static void main(String[] args) {
	StringBuffer br = new StringBuffer();
	System.out.println(br.capacity());
	br.append("abcdefghijklmnopqrs");
	System.out.println(br.capacity());
	
	
	StringBuffer b = new StringBuffer(100);
	//System.out.println(b.capacity());
    b.append(100);
    System.out.println(b);
	
    
    StringBuffer brr = new StringBuffer("hey hello");
    brr.insert(1, "HE");
    System.out.println(brr); //from length
    
    
    
    StringBuffer brrr = new StringBuffer("Hi hello");
    brrr.setLength(2);
    System.out.println(brrr);
    
    
    StringBuffer b2 = new StringBuffer("hello how are you.?");
    b2.insert(6, "vishwa ").append(" i am fine");
    System.out.println(b2);
    
    
    
}
	
}
