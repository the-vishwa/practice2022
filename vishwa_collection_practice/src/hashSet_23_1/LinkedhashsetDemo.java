package hashSet_23_1;

import java.util.LinkedHashSet;

public class LinkedhashsetDemo {
public static void main(String[] args) {
	
	LinkedHashSet<Integer>  hashset =new LinkedHashSet<>();
	hashset.add(100);
	hashset.add(10);
	hashset.add(50);
	hashset.add(10);
	hashset.add(200);
	hashset.add(400);
	hashset.add(null);
	hashset.add(null);
	
	System.out.println(hashset);
	
	
}
}
