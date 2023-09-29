package hash_map;

import java.util.HashMap;

public class Hashmapdemo {
public static void main(String[] args) {
	HashMap<Integer, String> map =new HashMap<>();
	map.put(11, "nana");
	map.put(15, "nirmal");
	map.put(12, "vishwa");
	map.put(13, "rana");
	
	String s1  = map.put(12, "x");
	System.out.println(s1);
	String s2  = map.put(14, "rana");
	System.out.println(s2);
	
	System.out.println(map.size());
	System.out.println(map);
	
	
	String v=map.get(12);
	System.out.println(v);
	
	
	
	
	
}
}
