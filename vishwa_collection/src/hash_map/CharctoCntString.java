package hash_map;

import java.util.HashMap;

public class CharctoCntString {
	public static void main(String[] args) {
		String str = "Hello hi how are you";
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (map.containsKey(ch)) {
				Integer c = map.get(ch);
				c++;
				map.put(ch, c);
			} else {

				map.put(ch, 1);
			}

		}

		System.out.println(map);
	}
}
