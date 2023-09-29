package stack_Demo;

import java.util.Stack;

public class StackOwn {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
	System.out.println(stack.indexOf(2));// ya obj chi index print karel
	System.out.println(stack.pop());
	System.out.println(stack.peek());
	
//	System.out.println(stack.search(2)); 
//	System.out.println("_____");
	
	System.out.println(stack.isEmpty());
	System.out.println(stack);
	}

}
