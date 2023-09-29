package loop;

public class Cse1 {
	int search(int[] arr,int a) {
		int cash=-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==a){
				return i;
			}
		}
		return cash;
}
}
