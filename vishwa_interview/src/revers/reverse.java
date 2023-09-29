package revers;

public class reverse {
public static void main(String[] args) {
	
	
	String[] str ={"v","i","s","h","w","a"};
	
	for (int i = 0; i < str.length; i++) {
		System.out.println(str[i]);
	}
	
	System.out.println("========");
	
	for (int i = str.length-1; i >= 0 ; i--) {
		System.out.println(str[i]);
	}
	
	
	//or 
	
	for (int i = str.length-1; 0 <= i; i--) {
		System.out.println(str[i]);
	}
	
	
}
}
