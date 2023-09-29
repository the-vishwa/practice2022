package some_logical_programs;

import java.util.Scanner;

public class Ageexpe {
	public static void main(String[] args) {
		int age ;
		System.out.println("plz enter ur age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		if (age >= 58) {
			System.out.println(" u r retired");
		} else if (age >56) {
			System.out.println("u r about to retired");
		} else if (age >55) {
			System.out.println(" u  r wellknown experienced");
		} else if (age >45) {
			System.out.println(" u  r experienced");
		} else if (age > 30) {
			System.out.println(" u  r experincing");
		} else if (age >= 22) {
			System.out.println(" under experince");
		} else if (age >= 18) {
			System.out.println(" u r studying");
		}else {
			System.out.println();
		}

	}
}
