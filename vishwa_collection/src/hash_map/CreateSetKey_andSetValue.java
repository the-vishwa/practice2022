package hash_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class CreateSetKey_andSetValue {
public static void main(String[] args) {
	HashMap<String, Integer> map=new HashMap<>();
	map.put("A", 1);
	map.put("A", 1);//duplicate not allow
	map.put("B", 1);
	map.put("C", 1);
	map.put("D", 1);
	
	
	Set<String> str =map.keySet();
	System.out.println(str);
	Collection<Integer> str1 =map.values();
	System.out.println(str1);
	System.out.println(map);
	//ArrayList<Integer> str1 =map.values();
	//ArrayList<Integer> str1 =(ArrayList<Integer>) map.values();
	
}
}
