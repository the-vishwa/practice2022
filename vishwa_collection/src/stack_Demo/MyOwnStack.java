package stack_Demo;

import java.util.LinkedList;

public class MyOwnStack {
	private LinkedList<Book> list;// =new LinkedList<>();

	public MyOwnStack() {
		this.list = new LinkedList<>();

	}

	void push(Book book) {
		this.list.addLast(book);
	}

	public Book out() {
		return this.list.removeLast(); // LIFO // LILO //
	}

	public static void main(String[] args) {
		 MyOwnStack stack = new MyOwnStack();
		stack.push(new Book("A", "a", 10)); // 1 add 4 removed
		stack.push(new Book("B", "b", 20));// 2 add 3 removed
		stack.push(new Book("C", "c", 25));// 3 add 2 removed
		stack.push(new Book("D", "d", 25));// 4 add 1 removed

		Book b = stack.out();
		System.out.println(b); // D

//			Book b1 = stack.pull();
//			System.out.println(b1);
//
//			Book b2 = stack.pull();
//			System.out.println(b2);
//		
//			Book b3 = stack.pull();
//			System.out.println(b3);
	}

}
