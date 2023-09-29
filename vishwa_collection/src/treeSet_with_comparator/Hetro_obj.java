package treeSet_with_comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Hetro_obj {
	public static void main(String[] args) {
		TreeSet<Object> t = new TreeSet<>(new Hetro());
		t.add("abc");
		t.add(new StringBuffer("vishwa"));
		t.add(new StringBuilder("rajput"));
		System.out.println(t);
	}
}

class Hetro implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
		
		
		
		

	}

}