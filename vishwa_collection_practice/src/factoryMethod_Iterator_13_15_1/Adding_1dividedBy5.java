package factoryMethod_Iterator_13_15_1;

import java.util.ArrayList;
import java.util.ListIterator;

public class Adding_1dividedBy5 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 10; i <= 100; i = i + 6) {
			al.add(i);
		}
	
		ListIterator<Integer> listitr = al.listIterator();
		System.out.println(al);
		while (listitr.hasNext()) {
			Integer i = listitr.next();
			if(i%5==0) {
				listitr.set(i+1);
			}
		}
		System.out.println(al);
	}
}
