package scanner1;

public class Arraycopy {

	int copyElement(int[] arr) {
		int indexx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				indexx++;
			}
		}
		return indexx;
	}

	int[] putEvenNum(int[] mixBucket, int[] empyBucket) {
		int increaseIndex = 0;
		for (int i = 0; i < mixBucket.length; i++) {
			if (mixBucket[i] % 2 == 0) {
				empyBucket[increaseIndex] = mixBucket[i];
				increaseIndex++;
			}
		}
		return empyBucket;
	}

	void printBoth(int[] Array) {
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i] + "  ");
		}

	}

}
