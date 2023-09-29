package loop;

public class ArrLoop {

	int search(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==3){
				return i;
			}
		}
		return -1;
}
}