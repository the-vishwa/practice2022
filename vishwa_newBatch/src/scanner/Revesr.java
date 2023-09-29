package scanner;

public class Revesr {
	
	static void print(String[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
	}
	 void reverse(String[] str1) {
		for (int i = str1.length-1; 0 <= i; i--) {
			System.out.println(str1[i]);
		}
		
	}
	
	
public static void main(String[] args) {
	String[] arr={"v","i","s","h"};
	
	print(arr);
	System.out.println("-__-");
	
	Revesr r = new Revesr();
	r.reverse(arr);
	
	
}
}

