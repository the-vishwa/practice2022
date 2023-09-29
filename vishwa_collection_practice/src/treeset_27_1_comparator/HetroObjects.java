package treeset_27_1_comparator;

import java.util.Comparator;
import java.util.TreeSet;

class HetroObject implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// return 1;
		String s1 = o1.toString();
		String s2 = o2.toString();

		return s1.compareTo(s2);
	}

}

public class HetroObjects {
	public static void main(String[] args) {

		TreeSet<Object> obj = new TreeSet<>(new HetroObject());
		obj.add("vishwa");
		obj.add(new StringBuffer("nirmal"));
		obj.add(new StringBuilder("mani"));
		obj.add(10);

		for (Object o : obj) {
			System.out.println(o);

		}
	}
}
