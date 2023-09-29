package treeset_27_1_comparator;

import java.util.Comparator;
import java.util.TreeSet;

class Imple implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		int i = o1.compareTo(o2);// for descndg order do  minus
//		 return -i;
//		 int i = o2.compareTo(o1);// descndg order
		if (i == 0) {
			return 0;
		} else {
			return i;
		}

	}
}

public class TreesetDemo {
	public static void main(String[] args) {

		TreeSet<String> tree = new TreeSet<>(new Imple());
		tree.add("b");
		tree.add("C");
		tree.add("u");
		tree.add("a");
		tree.add("a");
		tree.add("d");
		tree.add("Z");

		for (String s : tree) {
			System.out.println(s);
		}

	}
}
