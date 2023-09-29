package factoryMethod_Iterator_13_15_1;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	static void addValue(ArrayList<Integer> al,Integer i) {
		ListIterator<Integer> itr = al.listIterator();
		while(itr.hasNext()) {
			Integer p = itr.next();
			if(p.equals(i)) {
				 itr.set(12);
			}
			
			}
		}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(12);

//	for(int i =10; i<=100;i=i+6) {
//		al.add(i);
//	}
		ListIterator<Integer> listitr = al.listIterator();
		System.out.println(listitr.hasNext());
		System.out.println(listitr.nextIndex());
		System.out.println(listitr.hasPrevious());
		System.out.println(al);
		// listitr.set(100); not work
		// System.out.println(listitr.previous());// exception no such a element
		// System.out.println(listitr.previousIndex());//n-1
		// listitr.remove(); // for while loop use or purpose

		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(13);
		al1.add(14);
		al1.add(12);
		addValue(al1, 14);
		System.out.println(al1);
	}


}
