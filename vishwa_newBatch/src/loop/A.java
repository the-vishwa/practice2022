package loop;

public class A {
public static void main(String[] args) {
	int[] ar = { 3, 6 ,7 , 8 ,9,4, 6, 8, 7, 5 };
     
	for (int i = 0; i < ar.length; i++) {
		System.out.println(i);
		if(ar[i]==7) {
            System.out.println("present");			
    break;
		}
	}
	
}
}
