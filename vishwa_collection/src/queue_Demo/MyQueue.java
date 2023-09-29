package queue_Demo;

import java.util.LinkedList;

public class MyQueue {
	private LinkedList<ATM> list;// = new LinkedList<>();

	public MyQueue() {
		this.list = new LinkedList<>();
	}

	void push(ATM atm) {
		this.list.addLast(atm); // FIFO
	}

	public ATM pull() {
		return this.list.removeFirst();
	}

//	void MM(LinkedList<ATM> list, ATM m) {
//		list.add(m);
//	}
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.push(new ATM("vishwa", 12345)); // insert 1st removed 1st
		queue.push(new ATM("nirmal", 12346));// insert 2nd removed 2nd
		queue.push(new ATM("kuldip", 12347));// insert 3rd removed 3rd
		queue.push(new ATM("premjit", 12389));// insert last removed last

		ATM at = queue.pull();
		System.out.println(at);

	}

}
