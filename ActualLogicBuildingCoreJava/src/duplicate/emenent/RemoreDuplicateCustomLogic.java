package duplicate.emenent;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoreDuplicateCustomLogic {

	static void print(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "  ");
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 2, 4, 5, 6, 7, 8, 9, 2, 2 };
		print(arr);
		Set<Integer> set = new LinkedHashSet<>();
		for (int i : arr) {
			set.add(i);
		}
		Object[] obj = set.toArray();
		int[] arr2 = new int[obj.length];
		for (int i = 0; i < obj.length; i++) {
			arr2[i] = (Integer) obj[i];
		}
		arr = arr2;
		print(arr);
	}
}
