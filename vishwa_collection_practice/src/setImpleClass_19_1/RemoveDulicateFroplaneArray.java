package setImpleClass_19_1;

public class RemoveDulicateFroplaneArray {
	public static void main(String[] args) {
		Remo1 a = new Remo1();

		int[] mixBucket = { 1, 2, 4, 1, 5, 3, 2, 5, 1, 6, 4, 8 };

		int length = a.removeOb(mixBucket);

		int[] empyBucket = new int[length];

		a.putEvenNum(mixBucket, empyBucket);

		a.printBoth(mixBucket);
		System.out.println();
		a.printBoth(empyBucket);

	}

}
