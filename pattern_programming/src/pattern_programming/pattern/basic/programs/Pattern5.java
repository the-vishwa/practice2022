package pattern_programming.pattern.basic.programs;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your row count");

		int r = s.nextInt();

		for (int i = 1; i <= r; i++) {
      
			for(int j = 1; j <=i ; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}
}
