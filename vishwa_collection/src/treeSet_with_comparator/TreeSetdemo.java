package treeSet_with_comparator;

import java.util.Comparator;
import java.util.TreeSet;

//CustomSorting cannot be resolved to a type
public class TreeSetdemo {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>(new CustomSorting());
		tree.add("Ab");
		tree.add("Cc");
		tree.add("aB");
		tree.add("Zz");

		for (String s : tree) {
			System.out.println(s);
		}

	}
}

class CustomSorting implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		int i = o1.compareTo(o2);
		return i;
		//return o1.compareTo(o2);
		// return -o2.compareTo(o1);

	}

}