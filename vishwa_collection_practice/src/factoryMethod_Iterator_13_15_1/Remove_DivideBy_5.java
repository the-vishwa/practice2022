package factoryMethod_Iterator_13_15_1;

import java.util.ArrayList;
import java.util.ListIterator;

public class Remove_DivideBy_5 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 10; i <= 100; i = i + 6) {
			al.add(i);
		}
		System.out.println(al);
		ListIterator<Integer> listitr = al.listIterator();
		while (listitr.hasNext()) {
			Integer i = listitr.next();
			if (i % 5 == 0) {
				listitr.remove();
				System.out.println("-" + i);
			}
		}
		System.out.println(al);
	}
}
