package scanner;

public class Reverse1 {
public static void main(String[] args) {
	
	int[] array= {1,2,3,6,7,8,9};
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]+"  ");
	}
	System.out.println();
	
	for (int i = array.length-1; i >=0; i--) {
		System.out.print(array[i]+"  ");
	}
	System.out.println();
	for(int i=10; i >=1;i--) {
		System.out.println(i);
	}
	
}
}
