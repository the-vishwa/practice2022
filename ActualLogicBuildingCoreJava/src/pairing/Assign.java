package pairing;

import java.util.HashMap;
import java.util.Map;

public class Assign {
// frequ count with the helpof map and custom logic
	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 2, 42, 1, 50, 3, 20 ,7,7,7,7,7};

		Map<Integer, Integer> map = new HashMap<>();

		for (int i : arr) {
			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				Integer i1 = map.get(i);
				i1++;
				map.put(i, i1);
			}
		}
		System.out.println(map);
	}
}
