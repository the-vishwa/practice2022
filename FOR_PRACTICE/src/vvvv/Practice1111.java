package vvvv;

import java.util.HashMap;

public class Practice1111 {
public static void main(String[] args) {
	String str = "aa bb aaa bbb aa a aa bb bbb";
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
