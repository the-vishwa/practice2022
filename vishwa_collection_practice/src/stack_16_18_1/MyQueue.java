package stack_16_18_1;

import java.util.LinkedList;

public class MyQueue {
	LinkedList<Book> b=new LinkedList<>();

	public MyQueue() {
		
	}

	void push(Book b) {
		this.b.addLast(b); // add and addLast is same coz insertion order preserv
	}
	public Book pull() {
		return this.b.removeFirst();
	}
	
	public static void main(String[] args) {
		LinkedList<Book> b = new LinkedList<>();
		MyQueue q = new MyQueue();
		q.push(new Book(1, "Mrutyunjay"));
		q.push(new Book(2, "guide"));
		q.push(new Book(3, "panipat"));
		q.push(new Book(4, "ekch pyala"));
		
				Book b1=q.pull();
				System.out.println(b1);
				
//				Book b2=q.pull();
//				System.out.println(b2);
//				
//				Book b3=q.pull();
//				System.out.println(b3);
		
		
	}
}
