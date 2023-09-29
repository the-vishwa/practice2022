package linkedListDemo_10_1;

import java.util.LinkedList;

public class Demo {
public static void main(String[] args) {
	LinkedList<String> ll =new LinkedList();
	ll.add("a");
	ll.add("b");
	ll.add("c");
	ll.add("a");
	
	ll.add(null);
	System.out.println(ll);
	System.out.println(ll.contains("b"));
	//System.out.println(ll.remove(2)); // index passed
	System.out.println(ll);
	System.out.println(ll.isEmpty());
	// others all methods now u can use like size, is empty ,
	
	
	
	
}
}
