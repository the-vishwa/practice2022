package stack_16_18_1;

import java.util.LinkedList;

public class MyStack {
	LinkedList<Book> b;

	public MyStack() {
		this.b=  new LinkedList<>();
	}

	void push(Book b) {
		this.b.addLast(b);
	}

	public Book pull() {
		return this.b.removeLast();
	}

	@Override
	public String toString() {
		return "MyStack [b=" + b + "]";
	}

	public static void main(String[] args) {
		MyStack st = new MyStack();
		st.push(new Book(1, "Mrutyunjay"));
		st.push(new Book(2, "guide"));
		st.push(new Book(3, "panipat"));
		st.push(new Book(4, "ekch pyala"));

		System.out.println(st);
		Book b1 = st.pull();
		System.out.println(b1);

		Book b2 = st.pull();
		System.out.println(b2);

		Book b3 = st.pull();
		System.out.println(b3);

	}
}
