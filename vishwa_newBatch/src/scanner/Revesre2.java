package scanner;

public class Revesre2 {

	static void printtt(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}
	
public static void main(String[] args) {
	
	int[] array= {1,2,3,6,7,8,9};
	printtt(array);
	
	int[] sceond=new int[array.length];
	int j=0;
	for (int i = 0; i < array.length; i++) {
		sceond[j]=array[array.length-1-i];
		j++;
	}
	System.out.println();
	printtt(sceond);
	
	
	
	
	
	
	
	
	
}
	
}


