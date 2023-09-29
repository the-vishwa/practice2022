package LinkdHashMap;

import java.util.HashMap;

public class IdentityHashmapDemo {
public static void main(String[] args) {
	HashMap<String , Integer> map =new HashMap<>();
	String s1 = new String("vishwa");
	String s2 = new String("rana");
	map.put(s1, 100);
	map.put(s2, 200);
	System.out.println(map);
	
	Integer s3 = map.put(s1, 100);
	System.out.println(s3);
	
}
}
