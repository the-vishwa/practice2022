package linkedHashmap_4_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class LinkedhashmapDemo {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("hi", 457845);
		map.put("fine", 879456);
		map.put("help", 7845415);
		map.put("she", 123456);
// why insertion order is not presrv here.?
		Set<String> set = map.keySet();

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			Integer s=map.get(key);
			System.out.println(key+"="+s);

		}
	}
}
