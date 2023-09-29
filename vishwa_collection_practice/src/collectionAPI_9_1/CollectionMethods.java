package collectionAPI_9_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionMethods {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		boolean b = al.add("vishwa");
		System.out.println(b);

		LinkedList ll = new LinkedList();
		ll.add("1");
		ll.add("2");
		ll.add("3");
		ll.add("4");
		al.addAll(ll);
		System.out.println(al.contains("4"));
		System.out.println(al.get(0));
		System.out.println(al.size());
		// System.out.println(al.remove("vishwa"));
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.removeAll(ll));
		System.out.println(al.size());
		al.clear();
		System.out.println(al.size());

	}
}
