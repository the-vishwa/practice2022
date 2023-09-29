package scanner1;

public class CopyEvenArrayFormExistingArray {

	public static void main(String[] args) {
		Arraycopy a = new Arraycopy();
		// int[] mixBucket = {1,2,3,4,5,6,7,8,9,7,3};
		// int[] mixBucket = {2,4,6,8,10,12};
		
		 int[] mixBucket = {1,3,5,7,9};
		

		// mix madhun evenNum empty made put karayche ahet
		int length = a.copyElement(mixBucket);
		// System.out.println(length);

		
		
		if(length==0) {
		System.out.println(" there is all odd num");
		a.printBoth(mixBucket);
		
	 }else if (mixBucket.length == length) {
		 System.out.println("here all are even numbers");
			a.printBoth(mixBucket);
			System.out.println();
			a.printBoth(mixBucket);

		} else {
			
			int[] empyBucket = new int[length]; // 4 ltr empty bucket
			// System.out.println(empyBucket.length);

		a.putEvenNum(mixBucket, empyBucket);

			a.printBoth(mixBucket);
			System.out.println();
			a.printBoth(empyBucket);

		}

	}
}
