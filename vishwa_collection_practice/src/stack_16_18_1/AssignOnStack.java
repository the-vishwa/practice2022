package stack_16_18_1;

import java.util.LinkedList;

public class AssignOnStack {
	LinkedList<String> b = new LinkedList<>();
	
	// take a help from linked list6 method and create stack methods
	
	void push(String b) {
		this.b.addLast(b);
	}
	String peek() {
		return this.b.getLast();
	}
	int  search(String b) {
	   return	 this.b.lastIndexOf(b);
	}
	
public static void main(String[] args) {
	
	AssignOnStack as = new AssignOnStack();
	
	as.push("a");		
	as.push("b");		
	as.push("c");		
	as.push("d");
	as.push("e");
	
	System.out.println(as.peek());
	System.out.println(as.search("b"));
	
}
}
