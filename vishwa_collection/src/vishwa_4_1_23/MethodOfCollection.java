package vishwa_4_1_23;

import java.util.ArrayList;
import java.util.LinkedList;

public class MethodOfCollection {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		// 1]boolean add(Object o);
		boolean b = al.add("hi");
		// System.out.println(b);
		System.out.println("_________________________________");
		// 2] boolean addAll(Collection c);
		LinkedList ll = new LinkedList();
		ll.add("vishwa");
		ll.add("nirmal");
		ll.add("kuldip");
		ll.add("premjit");
		al.addAll(ll);
		System.out.println(al);
		System.out.println(al.size());// size means how many elements / obj are present
		System.out.println("_________________________________");
		System.out.println(al.remove("hi"));// remove means obj remove
		System.out.println(al);
		System.out.println(al.contains("vishwa")); // vishwa is present thats y true
		// contains method is for confirming that object is present or not which i given
		System.out.println(al.size());// there is 4 size of elements thats y 4
		System.out.println(al.isEmpty()); // obj is not empty thats y false
		System.out.println(al.removeAll(ll)); // Successfully removed thats y true
		System.out.println(al.isEmpty()); // object is empty thats y true
		System.out.println(al.size()); // there is nothing thats y zero

	}
}
