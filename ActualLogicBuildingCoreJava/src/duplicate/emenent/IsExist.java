package duplicate.emenent;

public class IsExist {

	static boolean isElemExist(int[] arr, int a) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };

		System.out.println(isElemExist(arr, 0));

	}
}
