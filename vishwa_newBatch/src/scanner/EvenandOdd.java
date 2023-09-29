package scanner;

import java.util.Scanner;

public class EvenandOdd {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("plz enter the num");
      boolean b = true;
	
	while(b) {
		int num = sc.nextInt();
		if (num % 2 == 0) {
		System.out.println("even num="+num);
		}else  {
			System.out.println("odd num="+num);
		}
	}
	
}
}

