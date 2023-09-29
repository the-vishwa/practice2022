package scanner;

import java.util.Scanner;

public class SizeArray {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	System.out.println("enter the size");

	int size = sc.nextInt();//5
	int[] array = new int[size];//5
	
	for (int i = 0; i < array.length; i++) {
		System.out.println("enter the elements"+i);
		array[i]=sc.nextInt();
	}
		System.out.println("end and added array");
	
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i] );
	
	}
	
	
}
	
	
	
	
	
}
