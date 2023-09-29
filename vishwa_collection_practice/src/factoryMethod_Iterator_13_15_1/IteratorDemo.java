package factoryMethod_Iterator_13_15_1;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	al.add(12);
	al.add(13);
	al.add(14);
	al.add(12);
	// remove
	Iterator<Integer> itr = al.iterator();
	while(itr.hasNext()) {
		Integer i = itr.next();
		if(i.equals(12)) {
			itr.remove();
			System.out.println(i);
		}
	}
	System.out.println(al);
}
}
