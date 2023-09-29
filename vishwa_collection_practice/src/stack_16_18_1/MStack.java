package stack_16_18_1;

import java.util.Stack;

public class MStack {
public static void main(String[] args) {
	
	Stack<String> stack = new Stack<>();
	stack.push("a");		// 4 indx start form 1 not zero
	stack.push("b");		//3
	stack.push("c");		// 2
	stack.push("d");  		// indx 1
	
	System.out.println(stack.pop()); // return and remove obj
	System.out.println(stack.peek());// only return last obj
	System.out.println(stack.search("e"));
	
	System.out.println(stack);
	
	
	
	
}
}
