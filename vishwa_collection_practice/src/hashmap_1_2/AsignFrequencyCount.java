package hashmap_1_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class AsignFrequencyCount {
public static void main(String[] args) {
	
	int[] arr = {1,2,3,1,1,4,3,3,2,6,7,3,4};
	
//	HashSet<Integer> set = new HashSet<>();
//	for (int i : arr) {
//		set.add(i);
//	}
//	System.out.println(set);
	
	Map<Integer, Integer> map = new HashMap<>();
	for (int key : arr) {
		if(!map.containsKey(key)) {
			map.put(key, 1);
		}else {
			Integer value=map.get(key);
			value++;
			map.put(key, value);
		}
	}
	System.out.println(map);
}
	
	
	
	
	
}
