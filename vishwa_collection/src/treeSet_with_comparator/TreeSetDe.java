package treeSet_with_comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDe {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add("Roja");
		t.add("ShobaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Ramulamma");

		for (Object object : t) {
			System.out.println(object);
		}
	}
}

class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = (String) obj2;
		// return s2.compareTo(s1);
		return -s1.compareTo(s2);

	}
}
