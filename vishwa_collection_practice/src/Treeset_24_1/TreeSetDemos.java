package Treeset_24_1;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemos {

	public static void main(String[] args) {

		TreeSet t = new TreeSet(new MyComparator());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("xx");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);// [A, AA, xx, ABC, ABCD]
	}
}

class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
//		int l1 = s1.length();
//		int l2 = s2.length();
		if (s1.length() < s2.length())
			return -1;
		else if (s1.length() > s2.length())
			return 1;
		else
			return s1.compareTo(s2);
	}
}
