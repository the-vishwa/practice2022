package hash_map;

import java.util.HashMap;

public class Assign {

	public static void main(String[] args) {
		int[] arr = { 8,1, 2, 3, 1, 1, 4, 3, 3, 2, 6, 7, 3, 4 };
		
		HashMap<Integer, Integer> map = new HashMap<>();

//		boolean r=false;
//		boolean r1=false;
//		boolean v1 =(r==r1);
//		System.out.println(v1);

		for (int key : arr) {
			if (!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				Integer v = map.get(key);
				v++;
				map.put(key, v);
			}
		}
		System.out.println(map);
	}
}
