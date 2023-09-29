package pairing;

public class Swip {
public static void main(String[] args) {
	
//	for (int i = str.length()-1; i >=0; i--) {
//		
//		System.out.print(str.charAt(i))
	
	String str = " Hi hello How Are You ?";
	StringBuffer br =new StringBuffer(str);
	for(int i=0; i<br.length();i++) {
		char ch = br.charAt(i);
		br.setCharAt(i, br.charAt(br.length()-1-i));
		br.setCharAt( br.charAt(br.length()-1-i),ch);
		//br.charAt(br.length()-1-i);
		//br.reverse();
		System.out.println(ch);
	}
	
	
	
	
}
}
