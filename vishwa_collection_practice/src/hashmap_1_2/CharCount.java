package hashmap_1_2;

import java.util.HashMap;

public class CharCount {
	public static void main(String[] args) {
		String str = "Hello hi how are you";
		char[] charArray = str.toCharArray();// char made covert karnyasathi to car
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : charArray) {
			
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				Integer i = map.get(ch);
				i++;
				map.put(ch, i);
			}

		}

		System.out.println(map);
	}
}
