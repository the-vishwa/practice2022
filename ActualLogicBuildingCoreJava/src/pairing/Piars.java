package pairing;

public class Piars {
public static void main(String[] args) {
	
	int[] arr= {11,23,4,5,6,7,9,5,};
	
	for (int i = 0; i < arr.length; i++) {
		for (int j=i+1; j < arr.length; j++) {
			//if(arr[i]!=arr[j]) {
				
				
				System.out.print("["+arr[i]+" , "+arr[j]+"]");
			//}
		
		}
		System.out.println();
	}
	
}
}
