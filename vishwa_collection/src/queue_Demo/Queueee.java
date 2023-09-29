package queue_Demo;

import java.util.LinkedList;
public class Queueee {

	public static void main(String[] args) {
		LinkedList<ATM> list = new LinkedList<>();
		list.add(new ATM("vishwa", 12345)); // insert 1st removed 1st
		list.add(new ATM("nirmal", 12346));// insert 2nd removed 2nd
		list.add(new ATM("kuldip", 12347));// insert 3rd removed 3rd
		list.add(new ATM("premjit", 12389));// insert last removed last
		list.add(new ATM("darpan", 12389));// insert last removed last

//	for (ATM atm : list) {
//		System.out.println(atm);
//	}
//	System.out.println("_____");
//System.out.println(list.removeFirst());	

		ATM.searchByplace(12389, list);
		System.out.println(list.size());
		System.out.println(list.pop());

	}
}
