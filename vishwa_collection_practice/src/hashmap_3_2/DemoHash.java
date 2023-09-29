package hashmap_3_2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class DemoHash {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("A", 100);
		map.put("B", 100);
		map.put("C", 100);
		map.put("D", 100);
		map.put("D", 100);

		Integer k = map.get("B");
		System.out.println(k);

		Set<String> set1 = map.keySet();
		Iterator<String> itr = set1.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			Integer value = map.get(key);
			System.out.println(key + "=" + value);

		}
		System.out.println("-------------");
//----------------------------------------------------------------------	

		Set<Entry<String, Integer>> entryset = map.entrySet();
		for (Entry<String, Integer> entry : entryset) {
			System.out.println(entry.getKey() + "=" + entry.getValue());

			if (entry.getKey().equals("B")) {
				entry.setValue(5000);
			}

		}
		System.out.println(entryset);
		System.out.println("-------------");

		// System.out.println(map);

		System.out.println(map.keySet());
		// or
		Set<String> sett = map.keySet();
		System.out.println(sett);

		Collection<Integer> i = map.values();
		System.out.println(i);

//-------------------------------------------------------		
		Set s1 = map.entrySet();
		Iterator itrr = s1.iterator();
		while (itrr.hasNext()) {
			HashMap.Entry m1 = (HashMap.Entry) itrr.next();
			System.out.println(m1.getKey() + "=>" + m1.getValue());

		}

	}
}
