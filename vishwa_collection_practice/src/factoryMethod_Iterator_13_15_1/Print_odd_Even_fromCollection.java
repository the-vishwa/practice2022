package factoryMethod_Iterator_13_15_1;

import java.util.Iterator;
import java.util.LinkedList;

public class Print_odd_Even_fromCollection {
	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(12);
		ll.add(13);
		ll.add(15);
		ll.add(16);
		
		Iterator<Integer> itr = ll.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			if(i%2==0) {
				System.out.println("num is evn"+i);
			}else
				System.out.println("num is odd"+i);
		}
		
		
	}
}
