package duplicate.emenent;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoWithList {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 2, 4, 5, 6, 7, 8, 9, 2, 2 };
		Set<Integer> set = new LinkedHashSet<>();

		for (int i : arr) {
			set.add(i);
		}
		System.out.println(set);
	}

}
