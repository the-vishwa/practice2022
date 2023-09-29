package setImpleClass_19_1;

public class Remo1 {

	int removeOb(int[] ar) {
		int indexx = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != ar[i + 1]) {
				indexx++;
			}
		}
		return indexx;
	}
	int[] putEvenNum(int[] mixBucket, int[] empyBucket) {
		int increaseIndex = 0;
		for (int i = 0; i < mixBucket.length; i++) {
			if (mixBucket[i] != mixBucket[i + 1]) {
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
