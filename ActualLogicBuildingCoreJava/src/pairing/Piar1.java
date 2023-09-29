package pairing;

public class Piar1 {
	public static void main(String[] args) {
		// find out the pair which have the sum is 10.
		int[] num = { 7, 2, 3, 5, 9, 8, 12, -2, 6, };
		int n = 10;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] + num[j] == n) {
					System.out.println("[" + num[i] + " , " + num[j] + "]");

				}
			}
		}

	}
}
