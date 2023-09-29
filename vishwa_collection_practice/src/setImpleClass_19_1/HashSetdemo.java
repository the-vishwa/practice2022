package setImpleClass_19_1;

import java.util.HashSet;

public class HashSetdemo {
public static void main(String[] args) {
	
HashSet<Integer> set = new HashSet<>();
	System.out.println(set.add(100));
	set.add(10);
	System.out.println(set.add(100));
	set.add(300);
	set.add(null);
	set.add(null);
	set.add(400);
	System.out.println(set);
	System.out.println(set.size());
	
	
	
}
}
