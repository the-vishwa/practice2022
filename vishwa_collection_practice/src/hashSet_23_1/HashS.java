package hashSet_23_1;

import java.util.HashSet;

public class HashS {
	public static void main(String[] args) {

		HashSet<Integer> hashset = new HashSet<>();

		hashset.add(100);
		hashset.add(10);
		hashset.add(50);
		hashset.add(10);
		hashset.add(200);
		hashset.add(400);
		hashset.add(null);
		hashset.add(null);

		for (Integer integer : hashset) {
			System.out.println(integer);
		}
		System.out.println(hashset);

	}
}
