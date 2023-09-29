package hash_map;

import java.util.HashMap;

public class ArrayNumcnt {
	public static void main(String[] args) {
		Integer[] arr = { 8, 1, 2, 3, 1, 1, 4, 3, 3, 2, 6, 7, 3, 4 };

		HashMap<Integer, Integer> map = new HashMap<>();

		for (Integer i : arr) {
			if (map.containsKey(i)) {
				Integer v=map.get(i);
				v++;  
				map.put(i, v);
			} else {
				map.put(i, 1);

			}

		}
		System.out.println(map);
	}
}
