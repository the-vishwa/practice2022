package LinkdHashMap;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Demo {
	public static void main(String[] args) {
		// HashMap<String, Integer> map = new HashMap<>();
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

		map.put("good", 2222);
		map.put("hi", 5522);
		map.put("fine", 5242);
		map.put("nice", 2486);

		System.out.println(map);

		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			Integer in = map.get(str);
			System.out.println(str + "=" + in);

		}

	}
}
