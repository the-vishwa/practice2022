package hash_map;

import java.util.HashMap;

public class Assign_of_string {
	public static void main(String[] args) {
		String[] arr = { "a", "a", "b", "c", "b" };
		HashMap<String, Integer> map = new HashMap<>();

		for (String i : arr) { //for (int i = 0; i <=arr.length; i++) {
			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				Integer b = map.get(i);
				b++;
				map.put(i, b);

			}

		}
		System.out.println(map);
	}

}
