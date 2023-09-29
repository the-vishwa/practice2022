package loop;

public class Even {
public static void main(String[] args) {
	int[] arr = { 3, 6 ,7 , 8 ,9,4, 6, 8, 7, 5 };
    
//	for (int i = 0; i < arr.length; i++) {
//		
//		if(arr[i]%2==0) {
//			System.out.println(arr[i]);
//		}
//		
//	
//	}
	
	
	int i = 0;
	while (i < arr.length) {
		if (arr[i] % 2 == 0) {
			System.out.println(arr[i]);
			i++;
		}
	}
}
}
