package treeset_27_1_comparator;

import java.util.Comparator;
import java.util.TreeSet;

// class Employee implements Comparator<Employee>{}
class Impls implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return 1;
		} else if (s1.length() < s2.length()) {
			return -1;
		} else {
			return s1.compareTo(s2);
		}
	}

}

public class CompratorONLengthSize {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>(new Impls());
		tree.add("aiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		tree.add("biiiiiiiiiiiiiiiii");
		tree.add("Ziiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		tree.add("ciiiiiiiiii");
		tree.add("Xjiiiiiiiiiiii");
		tree.add("aiiiiiiiiii");
		tree.add("Yiiiiiiiiii");
		tree.add("Wiiiiiiiiii");
		for (String s : tree) {//w,y,a,c,x,b,a,z
			System.out.println(s);
		}

	}
}
