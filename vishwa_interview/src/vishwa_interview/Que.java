package vishwa_interview;

import java.util.HashMap;

public class Que {
	public static void main(String[] args) {
		String str = "Hi hello hi how are you hi hello";
		HashMap<String, Integer> map = new HashMap<>();
		
			if (!map.containsKey(str)) {
				map.put(str, 1);
			} else {
				Integer t = map.get(str);
				t++;
				map.put(str, t);
			
			}
		
		System.out.println(map);

	}
}
