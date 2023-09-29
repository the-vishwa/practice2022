package oops;

import java.util.Scanner;

public class UsingscannerclassAreaFind {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");


		boolean b = true;
		while (b) {
			int side = sc.nextInt();
			
				int area = side * side;
				System.out.println("area is=" + area);
				int primeter = 4 * side;
				System.out.println("primeter is=" + primeter);
				System.out.println("enter the value");
			
		}

	}

}
