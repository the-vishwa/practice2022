package vishwa_10_1_LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> ll = new LinkedList<>();
	ll.add("sachin sir");
	ll.add("vishwa");
	ll.add("nirmal");
	ll.add("kuldip");
	ll.add("premjit");

	System.out.println(ll);
	System.out.println(ll.contains("sachin sir"));
	System.out.println(ll.size());
	System.out.println(ll.remove(3)); // with what is removed 
	System.out.println(ll.size());
	System.out.println(ll);
	
	
	
	
	
	
}
}
